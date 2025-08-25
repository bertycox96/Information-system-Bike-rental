package com.hnure.services;

import com.hnure.models.Bike;
import com.hnure.repository.BikeRepository;
import com.hnure.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BikeService {
    private final BikeRepository bikeRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public BikeService(BikeRepository bikeRepository, CategoryRepository categoryRepository) {
        this.bikeRepository = bikeRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Bike> getBikes() {
        return bikeRepository.findAll();
    }

    public Bike getBikeById(Long id) {
        return bikeRepository.findById(id).get();
    }

    public void addBike(Bike bike) {
        bike.setCategory(categoryRepository.findById(1L).get());
        bikeRepository.save(bike);
    }

    public void deleteBike(@RequestBody Long id) {
        bikeRepository.deleteById(id);
    }

}
