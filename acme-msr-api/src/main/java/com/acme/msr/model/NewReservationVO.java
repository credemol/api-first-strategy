package com.acme.msr.model;

import java.util.Objects;
import com.acme.msr.model.SeatVO;
import com.acme.msr.model.UserVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewReservationVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-26T08:22:38.793+09:00")

public class NewReservationVO   {
  @JsonProperty("seat")
  private SeatVO seat = null;

  @JsonProperty("user")
  private UserVO user = null;

  @JsonProperty("date")
  private LocalDate date = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    OCCUPIED("occupied");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("reservedAt")
  private DateTime reservedAt = null;

  public NewReservationVO seat(SeatVO seat) {
    this.seat = seat;
    return this;
  }

   /**
   * Get seat
   * @return seat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SeatVO getSeat() {
    return seat;
  }

  public void setSeat(SeatVO seat) {
    this.seat = seat;
  }

  public NewReservationVO user(UserVO user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserVO getUser() {
    return user;
  }

  public void setUser(UserVO user) {
    this.user = user;
  }

  public NewReservationVO date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public NewReservationVO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public NewReservationVO reservedAt(DateTime reservedAt) {
    this.reservedAt = reservedAt;
    return this;
  }

   /**
   * Get reservedAt
   * @return reservedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getReservedAt() {
    return reservedAt;
  }

  public void setReservedAt(DateTime reservedAt) {
    this.reservedAt = reservedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReservationVO newReservation = (NewReservationVO) o;
    return Objects.equals(this.seat, newReservation.seat) &&
        Objects.equals(this.user, newReservation.user) &&
        Objects.equals(this.date, newReservation.date) &&
        Objects.equals(this.status, newReservation.status) &&
        Objects.equals(this.reservedAt, newReservation.reservedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, user, date, status, reservedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReservationVO {\n");
    
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

