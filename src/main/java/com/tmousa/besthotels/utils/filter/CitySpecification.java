package com.tmousa.besthotels.utils.filter;

import com.tmousa.besthotels.models.BestHotel;

public class CitySpecification implements Specification<BestHotel> {

    private String city;

    public CitySpecification(String city) {
        this.city = city;
    }

    @Override
    public boolean isSatisfied(BestHotel hotel) {
        return city.equals(hotel.getCity());
    }
}
