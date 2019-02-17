package com.tmousa.besthotels.utils.filter;

import com.tmousa.besthotels.models.BestHotel;

public class NumberOfAdultsSpecification implements Specification<BestHotel> {

    private int numberOfAdults;

    public NumberOfAdultsSpecification(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    @Override
    public boolean isSatisfied(BestHotel hotel) {
        return hotel.getNumberOfAdults() == numberOfAdults;
    }
}
