package com.tmousa.besthotels.services;

import com.tmousa.besthotels.models.BestHotel;

import java.util.List;

public interface HotelsService {

    List<BestHotel> getHotels();

    List<BestHotel> getHotels(String city, String fromDate, String toDate, String numberOfAdults);

    List<BestHotel> filterHotels(List<BestHotel> hotels, String city, String fromDate, String toDate, String numberOfAdults);
}
