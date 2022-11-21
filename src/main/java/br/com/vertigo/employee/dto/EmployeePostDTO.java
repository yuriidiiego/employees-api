package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("EmployeePostDTO")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeePostDTO implements Serializable {

  @Valid private String firstName;

  @Valid private String lastName;

  @Valid private String department;

  @Valid private String jobTitle;

  @Valid private String employeeType;

  @Valid private LocalDate startDate;

  @Valid private String status;

  @Valid private String email;

  /** First name of the employee */
  public EmployeePostDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  @JsonProperty("firstName")
  @NotNull
  @Size(min = 3, max = 45)
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /** Last name of the employee */
  public EmployeePostDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @JsonProperty("lastName")
  @NotNull
  @Size(min = 3, max = 45)
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /** Department of the employee */
  public EmployeePostDTO department(String department) {
    this.department = department;
    return this;
  }

  @JsonProperty("department")
  @NotNull
  public String getDepartment() {
    return department;
  }

  @JsonProperty("department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /** Job title of the employee */
  public EmployeePostDTO jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  @JsonProperty("jobTitle")
  @NotNull
  public String getJobTitle() {
    return jobTitle;
  }

  @JsonProperty("jobTitle")
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /** Type of the employee */
  public EmployeePostDTO employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  @JsonProperty("employeeType")
  @NotNull
  public String getEmployeeType() {
    return employeeType;
  }

  @JsonProperty("employeeType")
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  /** Start date of the employee - format(dd/MM/yyyy) */
  public EmployeePostDTO startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonFormat(pattern = "dd/MM/yyyy")
  @JsonProperty("startDate")
  @NotNull
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonProperty("startDate")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /** Status of the employee */
  public EmployeePostDTO status(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /** Email of the employee */
  public EmployeePostDTO email(String email) {
    this.email = email;
    return this;
  }

  @JsonProperty("email")
  @NotNull
  @Size(min = 4, max = 45)
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePostDTO employeePostDTO = (EmployeePostDTO) o;
    return (Objects.equals(this.firstName, employeePostDTO.firstName)
        && Objects.equals(this.lastName, employeePostDTO.lastName)
        && Objects.equals(this.department, employeePostDTO.department)
        && Objects.equals(this.jobTitle, employeePostDTO.jobTitle)
        && Objects.equals(this.employeeType, employeePostDTO.employeeType)
        && Objects.equals(this.startDate, employeePostDTO.startDate)
        && Objects.equals(this.status, employeePostDTO.status)
        && Objects.equals(this.email, employeePostDTO.email));
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstName, lastName, department, jobTitle, employeeType, startDate, status, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePostDTO {\n");

    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
