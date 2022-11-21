package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("HeroResponseDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class HeroResponseDTO implements Serializable {

  private @Valid String id;
  private @Valid String nomeVerdadeiro;
  private @Valid String caracteristicas;

  /** */
  public HeroResponseDTO id(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /** */
  public HeroResponseDTO nomeVerdadeiro(String nomeVerdadeiro) {
    this.nomeVerdadeiro = nomeVerdadeiro;
    return this;
  }

  @JsonProperty("nomeVerdadeiro")
  public String getNomeVerdadeiro() {
    return nomeVerdadeiro;
  }

  @JsonProperty("nomeVerdadeiro")
  public void setNomeVerdadeiro(String nomeVerdadeiro) {
    this.nomeVerdadeiro = nomeVerdadeiro;
  }

  /** */
  public HeroResponseDTO caracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
    return this;
  }

  @JsonProperty("caracteristicas")
  public String getCaracteristicas() {
    return caracteristicas;
  }

  @JsonProperty("caracteristicas")
  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeroResponseDTO heroResponseDTO = (HeroResponseDTO) o;
    return Objects.equals(this.id, heroResponseDTO.id)
        && Objects.equals(this.nomeVerdadeiro, heroResponseDTO.nomeVerdadeiro)
        && Objects.equals(this.caracteristicas, heroResponseDTO.caracteristicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeVerdadeiro, caracteristicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeroResponseDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeVerdadeiro: ").append(toIndentedString(nomeVerdadeiro)).append("\n");
    sb.append("    caracteristicas: ").append(toIndentedString(caracteristicas)).append("\n");
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
