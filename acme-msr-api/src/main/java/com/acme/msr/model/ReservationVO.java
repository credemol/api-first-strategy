package com.acme.msr.model;

import java.util.Objects;
import com.acme.msr.model.NewReservationVO;
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
 * ReservationVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-26T08:22:38.793+09:00")

public class ReservationVO   {
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

  @JsonProperty("id")
  private Long id = null;

  public ReservationVO seat(SeatVO seat) {
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

  public ReservationVO user(UserVO user) {
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

  public ReservationVO date(LocalDate date) {
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

  public ReservationVO status(StatusEnum status) {
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

  public ReservationVO reservedAt(DateTime reservedAt) {
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

  public ReservationVO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationVO reservation = (ReservationVO) o;
    return Objects.equals(this.seat, reservation.seat) &&
        Objects.equals(this.user, reservation.user) &&
        Objects.equals(this.date, reservation.date) &&
        Objects.equals(this.status, reservation.status) &&
        Objects.equals(this.reservedAt, reservation.reservedAt) &&
        Objects.equals(this.id, reservation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, user, date, status, reservedAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationVO {\n");
    
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedAt: ").append(toIndentedString(reservedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

