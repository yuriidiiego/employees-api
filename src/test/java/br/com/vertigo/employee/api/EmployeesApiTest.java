package br.com.vertigo.employee.api;

import br.com.vertigo.employee.model.EmployeeModel;
import br.com.vertigo.employee.repository.EmployeeRepository;
import io.quarkus.test.junit.QuarkusTest;
import java.util.Optional;
import javax.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class EmployeesApiTest {

  @Inject
  EmployeeRepository employeeRepository;

  private int existingEmployeeId;
  private int nonExistingEmployeeId;

  @BeforeEach
  void setup() throws Exception {
    existingEmployeeId = 10;
    nonExistingEmployeeId = 1;
  }

  @Test
  public void findByIdShouldReturnNonEmptyOptionalEmployeeWhenIdExists() { // deve retornar
    Optional<EmployeeModel> result = employeeRepository.findByIdOptional(
      existingEmployeeId
    );
    Assertions.assertTrue(result.isPresent());
  }
}
