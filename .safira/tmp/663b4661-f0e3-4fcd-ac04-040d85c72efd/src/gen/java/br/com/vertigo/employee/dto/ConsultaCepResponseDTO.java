package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("ConsultaCepResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ConsultaCepResponseDTO implements Serializable {

  private @Valid String bairro;
  private @Valid String cep;
  private @Valid String cidade;
  private @Valid String complemento;
  private @Valid String endereco;
  private @Valid String uf;

  /** */
  public ConsultaCepResponseDTO bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }

  @JsonProperty("bairro")
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  /** */
  public ConsultaCepResponseDTO cep(String cep) {
    this.cep = cep;
    return this;
  }

  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }

  @JsonProperty("cep")
  public void setCep(String cep) {
    this.cep = cep;
  }

  /** */
  public ConsultaCepResponseDTO cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }

  @JsonProperty("cidade")
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  /** */
  public ConsultaCepResponseDTO complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }

  @JsonProperty("complemento")
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  /** */
  public ConsultaCepResponseDTO endereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

  @JsonProperty("endereco")
  public String getEndereco() {
    return endereco;
  }

  @JsonProperty("endereco")
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  /** */
  public ConsultaCepResponseDTO uf(String uf) {
    this.uf = uf;
    return this;
  }

  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }

  @JsonProperty("uf")
  public void setUf(String uf) {
    this.uf = uf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaCepResponseDTO consultaCepResponseDTO = (ConsultaCepResponseDTO) o;
    return Objects.equals(this.bairro, consultaCepResponseDTO.bairro)
        && Objects.equals(this.cep, consultaCepResponseDTO.cep)
        && Objects.equals(this.cidade, consultaCepResponseDTO.cidade)
        && Objects.equals(this.complemento, consultaCepResponseDTO.complemento)
        && Objects.equals(this.endereco, consultaCepResponseDTO.endereco)
        && Objects.equals(this.uf, consultaCepResponseDTO.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bairro, cep, cidade, complemento, endereco, uf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaCepResponseDTO {\n");

    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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
