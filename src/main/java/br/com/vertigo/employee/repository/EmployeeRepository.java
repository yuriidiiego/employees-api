package br.com.vertigo.employee.repository;

import br.com.vertigo.employee.model.EmployeeModel;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeRepository
  implements PanacheRepositoryBase<EmployeeModel, Integer> {}
