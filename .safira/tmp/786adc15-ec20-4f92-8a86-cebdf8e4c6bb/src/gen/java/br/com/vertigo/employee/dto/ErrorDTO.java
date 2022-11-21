package br.com.vertigo.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;

@JsonTypeName("ErrorDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class ErrorDTO implements Serializable {

  private @Valid String from;
  private @Valid String error;
  private @Valid String message;
  private @Valid OffsetDateTime timestamp;

  /** */
  public ErrorDTO from(String from) {
    this.from = from;
    return this;
  }

  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  @JsonProperty("from")
  public void setFrom(String from) {
    this.from = from;
  }

  /** */
  public ErrorDTO error(String error) {
    this.error = error;
    return this;
  }

  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(String error) {
    this.error = error;
  }

  /** */
  public ErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /** */
  public ErrorDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDTO errorDTO = (ErrorDTO) o;
    return Objects.equals(this.from, errorDTO.from)
        && Objects.equals(this.error, errorDTO.error)
        && Objects.equals(this.message, errorDTO.message)
        && Objects.equals(this.timestamp, errorDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, error, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDTO {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
