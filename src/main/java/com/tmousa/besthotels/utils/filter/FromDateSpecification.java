package com.tmousa.besthotels.utils.filter;

import com.tmousa.besthotels.models.BestHotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FromDateSpecification implements Specification<BestHotel> {

    public static final String ISO_LOCALE_DATE = "YYYY-MM-DD";

    private Date fromDate;

    public FromDateSpecification(String fromDate) throws ParseException {
        this.fromDate = new SimpleDateFormat(ISO_LOCALE_DATE).parse(fromDate);
    }

    @Override
    public boolean isSatisfied(BestHotel hotel) {
        try {
            return fromDate.compareTo(new SimpleDateFormat(ISO_LOCALE_DATE).parse(hotel.getFromDate())) >= 0;
        } catch (ParseException e) {
            return false;
        }
    }
}
