package com.capstone.api.capstoneapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Game
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-28T15:40:47.410672700-05:00[America/Toronto]")
public class Game {

  private String gameId;

  private String hostId;

  private String guestId;

  private String code;
  private int hostScore;
  private int guestScore;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate gameDate;

  public Game gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
  */
  
  @Schema(name = "gameId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameId")
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public Game hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * Get hostId
   * @return hostId
  */
  
  @Schema(name = "hostId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostId")
  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public Game guestId(String guestId) {
    this.guestId = guestId;
    return this;
  }

  /**
   * Get guestId
   * @return guestId
   */

  @Schema(name = "guestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guestId")
  public String getGuestId() {
    return guestId;
  }

  public void setGuestId(String guestId) {
    this.guestId = guestId;
  }

  public Game guestScore(int guestScore) {
    this.guestScore = guestScore;
    return this;
  }

  /**
   * Get guestScore
   * @return guestScore
  */
  
  @Schema(name = "guestScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guestScore")
  public int getGuestScore() {
    return guestScore;
  }

  public void setGuestScore(int guestScore) {
    this.guestScore = guestScore;
  }

  public Game hostScore(int hostScore) {
    this.hostScore = hostScore;
    return this;
  }

  /**
   * Get hostScore
   * @return hostScore
   */

  @Schema(name = "hostScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostScore")
  public int getHostScore() {
    return hostScore;
  }

  public void setHostScore(int hostScore) {
    this.hostScore = hostScore;
  }

  public Game code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */

  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Game gameDate(LocalDate gameDate) {
    this.gameDate = gameDate;
    return this;
  }

  /**
   * Get gameDate
   * @return gameDate
  */
  @Valid 
  @Schema(name = "gameDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameDate")
  public LocalDate getGameDate() {
    return gameDate;
  }

  public void setGameDate(LocalDate gameDate) {
    this.gameDate = gameDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.gameId, game.gameId) &&
        Objects.equals(this.hostId, game.hostId) &&
        Objects.equals(this.guestId, game.guestId) &&
        Objects.equals(this.gameDate, game.gameDate) &&
            Objects.equals(this.guestScore, game.guestScore) &&
            Objects.equals(this.hostScore, game.hostScore) &&
        Objects.equals(this.code, game.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, hostId, guestId, gameDate, guestScore, hostScore,code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    guestId: ").append(toIndentedString(guestId)).append("\n");
    sb.append("    guestScore: ").append(toIndentedString(guestScore)).append("\n");
    sb.append("    hostScore: ").append(toIndentedString(hostScore)).append("\n");
    sb.append("    gameDate: ").append(toIndentedString(gameDate)).append("\n");
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

