package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

@JsonTypeName("HeroResponseDTO")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class HeroResponseDTO implements Serializable {

  @Valid private Integer id;

  @Valid private String nomeVerdadeiro;

  @Valid private String caracteristica;

  /** */
  public HeroResponseDTO id(Integer id) {
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
  public HeroResponseDTO caracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
    return this;
  }

  @JsonProperty("caracteristica")
  public String getCaracteristica() {
    return caracteristica;
  }

  @JsonProperty("caracteristica")
  public void setCaracteristica(String caracteristica) {
    this.caracteristica = caracteristica;
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
    return (Objects.equals(this.id, heroResponseDTO.id)
        && Objects.equals(this.nomeVerdadeiro, heroResponseDTO.nomeVerdadeiro)
        && Objects.equals(this.caracteristica, heroResponseDTO.caracteristica));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeVerdadeiro, caracteristica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeroResponseDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeVerdadeiro: ").append(toIndentedString(nomeVerdadeiro)).append("\n");
    sb.append("    caracteristica: ").append(toIndentedString(caracteristica)).append("\n");
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
