package com.tmousa.besthotels.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BestHotel {
    private String hotel;

    @JsonIgnore
    private String city;

    private int hotelRate;
    private double hotelFare;

    private String roomAmenities;

    @JsonIgnore
    private int numberOfAdults;

    @JsonIgnore
    private String fromDate;
    @JsonIgnore
    private String toDate;
}
