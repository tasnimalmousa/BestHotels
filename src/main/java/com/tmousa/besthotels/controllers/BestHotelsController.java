package com.tmousa.besthotels.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmousa.besthotels.services.BestHotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/bestHotels")
public class BestHotelsController {
    @Autowired
    BestHotelsService bestHotelsService;

    @GetMapping
    @ResponseBody
    public String availableHotels(@RequestParam(required = false) String city,
                                  @RequestParam(required = false) String fromDate,
                                  @RequestParam(required = false) String toDate,
                                  @RequestParam(required = false) String numberOfAdults,
                                  HttpServletRequest request) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(bestHotelsService.getHotels(city, fromDate, toDate, numberOfAdults));
    }


}
