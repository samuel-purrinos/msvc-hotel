package com.uichesoh.hotelservice.service;

import com.uichesoh.hotelservice.entity.Hotel;
import com.uichesoh.hotelservice.exceptions.ResourceNotFoundException;
import com.uichesoh.hotelservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel getHotelById(String id) {

        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found with id "+id));
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
