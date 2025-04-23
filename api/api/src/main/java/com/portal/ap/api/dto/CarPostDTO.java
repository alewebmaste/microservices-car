package com.portal.ap.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarPostDTO {

    @JsonProperty("model")
    private String model;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("description")
    private String description;
    @JsonProperty("engineVersion")
    private String engineVersion;
    @JsonProperty("city")
    private String city;
    @JsonProperty("createdData")
    private String createdData;
    @JsonProperty("ownerId")
    private Long ownerId;

}
