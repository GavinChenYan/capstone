package com.capstone.api.capstoneapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Verifier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-28T15:40:47.410672700-05:00[America/Toronto]")
public class Verifier {

  private String email;

  private Long code;

  public Verifier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Verifier(String email) {
    this.email = email;
  }

  public Verifier email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Verifier code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verifier verifier = (Verifier) o;
    return Objects.equals(this.email, verifier.email) &&
        Objects.equals(this.code, verifier.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verifier {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

