package ee.ria.tara.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ee.ria.tara.model.EmailAlert;
import ee.ria.tara.model.LoginAlert;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Alert
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Alert   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("start_time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @JsonProperty("end_time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime;

  @JsonProperty("login_alert")
  private LoginAlert loginAlert;

  @JsonProperty("email_alert")
  private EmailAlert emailAlert;

  @JsonProperty("created_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Alert id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1234567", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Alert title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull @Size(max = 255) 
  @Schema(name = "title", example = "Plaaniline katkestus SK teenustes", required = true)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Alert startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @NotNull @Valid 
  @Schema(name = "start_time", example = "2019-08-24T14:15:22Z", required = true)
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Alert endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @NotNull @Valid 
  @Schema(name = "end_time", example = "2019-08-24T14:15:22Z", required = true)
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Alert loginAlert(LoginAlert loginAlert) {
    this.loginAlert = loginAlert;
    return this;
  }

  /**
   * Get loginAlert
   * @return loginAlert
  */
  @Valid 
  @Schema(name = "login_alert", required = false)
  public LoginAlert getLoginAlert() {
    return loginAlert;
  }

  public void setLoginAlert(LoginAlert loginAlert) {
    this.loginAlert = loginAlert;
  }

  public Alert emailAlert(EmailAlert emailAlert) {
    this.emailAlert = emailAlert;
    return this;
  }

  /**
   * Get emailAlert
   * @return emailAlert
  */
  @Valid 
  @Schema(name = "email_alert", required = false)
  public EmailAlert getEmailAlert() {
    return emailAlert;
  }

  public void setEmailAlert(EmailAlert emailAlert) {
    this.emailAlert = emailAlert;
  }

  public Alert createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", example = "2019-08-24T14:15:22Z", required = false)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Alert updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", example = "2019-08-24T14:15:22Z", required = false)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    return Objects.equals(this.id, alert.id) &&
        Objects.equals(this.title, alert.title) &&
        Objects.equals(this.startTime, alert.startTime) &&
        Objects.equals(this.endTime, alert.endTime) &&
        Objects.equals(this.loginAlert, alert.loginAlert) &&
        Objects.equals(this.emailAlert, alert.emailAlert) &&
        Objects.equals(this.createdAt, alert.createdAt) &&
        Objects.equals(this.updatedAt, alert.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, startTime, endTime, loginAlert, emailAlert, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    loginAlert: ").append(toIndentedString(loginAlert)).append("\n");
    sb.append("    emailAlert: ").append(toIndentedString(emailAlert)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

