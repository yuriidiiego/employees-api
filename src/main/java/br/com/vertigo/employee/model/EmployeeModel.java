package br.com.vertigo.employee.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder(toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeModel implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "employee_id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "department")
  private String department;

  @Column(name = "job_title")
  private String jobTitle;

  @Column(name = "employee_type")
  private String employeeType;

  @Column(name = "start_date")
  private LocalDate startDate;

  @Column(name = "status")
  private String status;

  @Column(name = "email")
  private String email;
}
