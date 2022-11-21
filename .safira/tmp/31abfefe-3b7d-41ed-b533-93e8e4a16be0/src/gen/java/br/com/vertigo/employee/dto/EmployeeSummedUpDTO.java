package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("EmployeeSummedUpDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class EmployeeSummedUpDTO implements Serializable {

  private @Valid String nome;
  private @Valid String sobreNome;

  /** */
  public EmployeeSummedUpDTO nome(String nome) {
    this.nome = nome;
    return this;
  }

  @JsonProperty("nome")
  @NotNull
  public String getNome() {
    return nome;
  }

  @JsonProperty("nome")
  public void setNome(String nome) {
    this.nome = nome;
  }

  /** */
  public EmployeeSummedUpDTO sobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
    return this;
  }

  @JsonProperty("sobreNome")
  public String getSobreNome() {
    return sobreNome;
  }

  @JsonProperty("sobreNome")
  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeSummedUpDTO employeeSummedUpDTO = (EmployeeSummedUpDTO) o;
    return Objects.equals(this.nome, employeeSummedUpDTO.nome)
        && Objects.equals(this.sobreNome, employeeSummedUpDTO.sobreNome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sobreNome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeSummedUpDTO {\n");

    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sobreNome: ").append(toIndentedString(sobreNome)).append("\n");
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
