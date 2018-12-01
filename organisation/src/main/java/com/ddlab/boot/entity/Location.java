package com.ddlab.boot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonPropertyOrder({"officeName", "streetName", "city", "pincode"})
public class Location {

  @JsonProperty private String officeName;
  @JsonProperty private String streetName;
  @JsonProperty private String city;
  @JsonProperty private String pincode;
}
