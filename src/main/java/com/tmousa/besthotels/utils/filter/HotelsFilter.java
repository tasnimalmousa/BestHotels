package com.tmousa.besthotels.utils.filter;

import com.tmousa.besthotels.models.BestHotel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class HotelsFilter implements Filter<BestHotel> {

    @Override
    public Stream<BestHotel> filter(List<BestHotel> items, Specification<BestHotel> specification) {
        return items.stream().filter(hotel -> specification.isSatisfied(hotel));
    }
}
