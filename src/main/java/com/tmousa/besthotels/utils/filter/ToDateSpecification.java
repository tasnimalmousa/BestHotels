package com.tmousa.besthotels.utils.filter;

import com.tmousa.besthotels.models.BestHotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDateSpecification implements Specification<BestHotel> {

    public static final String ISO_LOCALE_DATE = "YYYY-MM-DD";

    private Date toDate;

    public ToDateSpecification(String toDate) throws ParseException {
        this.toDate = new SimpleDateFormat(ISO_LOCALE_DATE).parse(toDate);
    }

    @Override
    public boolean isSatisfied(BestHotel hotel) {
        try {
            return toDate.compareTo(new SimpleDateFormat(ISO_LOCALE_DATE).parse(hotel.getToDate())) <= 0;
        } catch (ParseException e) {
            return false;
        }
    }
}
