package com.uichesoh.hotelservice.service;

import com.uichesoh.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel getHotelById(String id);
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();

}
