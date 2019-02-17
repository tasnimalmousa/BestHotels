package com.tmousa.besthotels.services;

import com.tmousa.besthotels.models.BestHotel;
import com.tmousa.besthotels.repositories.BestHotelsRepository;
import com.tmousa.besthotels.utils.filter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BestHotelsService implements HotelsService {
    @Autowired
    BestHotelsRepository bestHotelsRepository;

    @Autowired
    HotelsFilter hotelsFilter;

    @Override
    public List<BestHotel> getHotels() {
        return bestHotelsRepository.get();
    }

    @Override
    public List<BestHotel> getHotels(String city, String fromDate, String toDate, String numberOfAdults) {
        List<BestHotel> hotels = getHotels();
        return filterHotels(hotels, city, fromDate, toDate, numberOfAdults);
    }

    @Override
    public List<BestHotel> filterHotels(List<BestHotel> hotels, String city, String fromDate, String toDate, String numberOfAdults) {
        List<BestHotel> filteredHotels = hotels;

        if (city != null && !city.isEmpty()) {
            filteredHotels = hotelsFilter.filter(filteredHotels, new CitySpecification(city)).collect(Collectors.toList());
            ;
        }

        if (numberOfAdults != null && !numberOfAdults.isEmpty()) {
            filteredHotels = hotelsFilter.filter(filteredHotels, new NumberOfAdultsSpecification(Integer.valueOf(numberOfAdults))).collect(Collectors.toList());
            ;
        }

        if (fromDate != null && !fromDate.isEmpty()) {
            try {
                filteredHotels = hotelsFilter.filter(filteredHotels, new FromDateSpecification(fromDate)).collect(Collectors.toList());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ;
        }

        if (toDate != null && !toDate.isEmpty()) {
            try {
                filteredHotels = hotelsFilter.filter(filteredHotels, new ToDateSpecification(toDate)).collect(Collectors.toList());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ;
        }

        return filteredHotels;
    }
}
