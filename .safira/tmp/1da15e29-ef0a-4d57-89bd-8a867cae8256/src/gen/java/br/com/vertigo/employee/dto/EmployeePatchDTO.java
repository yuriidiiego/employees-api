package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("EmployeePatchDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeePatchDTO implements Serializable {

  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid LocalDate startDate;
  private @Valid String status;
  private @Valid String email;

  /** Department of the employee */
  public EmployeePatchDTO department(String department) {
    this.department = department;
    return this;
  }

  @JsonProperty("department")
  public String getDepartment() {
    return department;
  }

  @JsonProperty("department")
  public void setDepartment(String department) {
    this.department = department;
  }

  /** Job title of the employee */
  public EmployeePatchDTO jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  @JsonProperty("jobTitle")
  public String getJobTitle() {
    return jobTitle;
  }

  @JsonProperty("jobTitle")
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /** Type of the employee */
  public EmployeePatchDTO employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  @JsonProperty("employeeType")
  public String getEmployeeType() {
    return employeeType;
  }

  @JsonProperty("employeeType")
  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  /** Start date of the employee - format(dd/MM/yyyy) */
  public EmployeePatchDTO startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  @JsonProperty("startDate")
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /** Status of the employee */
  public EmployeePatchDTO status(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(String status) {
    this.status = status;
  }

  /** Email of the employee */
  public EmployeePatchDTO email(String email) {
    this.email = email;
    return this;
  }

  @JsonProperty("email")
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
    EmployeePatchDTO employeePatchDTO = (EmployeePatchDTO) o;
    return Objects.equals(this.department, employeePatchDTO.department)
        && Objects.equals(this.jobTitle, employeePatchDTO.jobTitle)
        && Objects.equals(this.employeeType, employeePatchDTO.employeeType)
        && Objects.equals(this.startDate, employeePatchDTO.startDate)
        && Objects.equals(this.status, employeePatchDTO.status)
        && Objects.equals(this.email, employeePatchDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(department, jobTitle, employeeType, startDate, status, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePatchDTO {\n");

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
