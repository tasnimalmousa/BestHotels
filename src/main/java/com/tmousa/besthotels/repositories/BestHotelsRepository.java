package com.tmousa.besthotels.repositories;

import com.tmousa.besthotels.models.BestHotel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BestHotelsRepository {

    public List<BestHotel> get() {
        ArrayList<BestHotel> hotels = new ArrayList<BestHotel>();

        BestHotel bestHotel = BestHotel.builder()
                .hotel("Best Hotel 1")
                .city("AMM")
                .hotelFare(100.03)
                .hotelRate(5)
                .roomAmenities("Pool,TV")
                .numberOfAdults(3)
                .fromDate("2016-02-18")
                .toDate("2018-02-18")
                .build();
        hotels.add(bestHotel);

        BestHotel bestHote2 = BestHotel.builder()
                .hotel("Best Hotel 2")
                .city("ZAR")
                .hotelFare(100.03)
                .hotelRate(2)
                .roomAmenities("Pool,TV")
                .numberOfAdults(2)
                .fromDate("2016-02-18")
                .toDate("2020-02-18")
                .build();
        hotels.add(bestHote2);

        BestHotel bestHote3 = BestHotel.builder()
                .hotel("Best Hotel 3")
                .city("AMM")
                .hotelFare(100.03)
                .hotelRate(5)
                .roomAmenities("Pool,TV")
                .numberOfAdults(1)
                .fromDate("2016-02-18")
                .toDate("2030-02-18")
                .build();
        hotels.add(bestHote3);

        return hotels;
    }
}
