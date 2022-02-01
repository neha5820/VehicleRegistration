package com.infyniteloop.tech.vehicleregistration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * Registrations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-01-31T23:28:49.729+11:00")
@Entity
public class Registrations  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("number_plate")
  private String numberPlate = null;

  @JsonProperty("vehicle")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="vehicle_id")
  private Vehicle vehicle = null;

  @JsonProperty("insurer")
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="insurer_id")
  private Insurer insurer = null;



  public Registrations id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Registrations numberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
    return this;
  }

  /**
   * Get numberPlate
   * @return numberPlate
  **/
  @ApiModelProperty(value = "")


  public String getNumberPlate() {
    return numberPlate;
  }

  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }

  public Registrations insurer(Insurer insurer) {
    this.insurer = insurer;
    return this;
  }

  /**
   * Get insurer
   * @return insurer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Insurer getInsurer() {
    return insurer;
  }

  public void setInsurer(Insurer insurer) {
    this.insurer = insurer;
  }

  public Registrations vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registrations registrations = (Registrations) o;
    return Objects.equals(this.id, registrations.id) &&
        Objects.equals(this.numberPlate, registrations.numberPlate) &&
        Objects.equals(this.insurer, registrations.insurer) &&
        Objects.equals(this.vehicle, registrations.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numberPlate, insurer, vehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registrations {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberPlate: ").append(toIndentedString(numberPlate)).append("\n");
    sb.append("    insurer: ").append(toIndentedString(insurer)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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

