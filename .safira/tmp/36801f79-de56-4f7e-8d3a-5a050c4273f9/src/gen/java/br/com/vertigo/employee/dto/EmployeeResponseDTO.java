package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("EmployeeResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeeResponseDTO implements Serializable {

  private @Valid Integer id;
  private @Valid String firstName;
  private @Valid String lastName;
  private @Valid String department;
  private @Valid String jobTitle;
  private @Valid String employeeType;
  private @Valid LocalDate startDate;
  private @Valid String status;
  private @Valid String email;

  /** Employee ID */
  public EmployeeResponseDTO id(Integer id) {
    this.id = id;
    return this;
  }

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  /** First name of the employee */
  public EmployeeResponseDTO firstName(String firstName) {
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
  public EmployeeResponseDTO lastName(String lastName) {
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
  public EmployeeResponseDTO department(String department) {
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
  public EmployeeResponseDTO jobTitle(String jobTitle) {
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
  public EmployeeResponseDTO employeeType(String employeeType) {
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
  public EmployeeResponseDTO startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

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
  public EmployeeResponseDTO status(String status) {
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
  public EmployeeResponseDTO email(String email) {
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
    EmployeeResponseDTO employeeResponseDTO = (EmployeeResponseDTO) o;
    return Objects.equals(this.id, employeeResponseDTO.id)
        && Objects.equals(this.firstName, employeeResponseDTO.firstName)
        && Objects.equals(this.lastName, employeeResponseDTO.lastName)
        && Objects.equals(this.department, employeeResponseDTO.department)
        && Objects.equals(this.jobTitle, employeeResponseDTO.jobTitle)
        && Objects.equals(this.employeeType, employeeResponseDTO.employeeType)
        && Objects.equals(this.startDate, employeeResponseDTO.startDate)
        && Objects.equals(this.status, employeeResponseDTO.status)
        && Objects.equals(this.email, employeeResponseDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id, firstName, lastName, department, jobTitle, employeeType, startDate, status, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeResponseDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
