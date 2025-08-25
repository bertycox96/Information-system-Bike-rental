package com.hnure.controller;

import com.hnure.models.Bike;
import com.hnure.services.BikeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//@RestController
@Controller
@RequestMapping("/bikes")
@Api(value = "bikes")
public class BikeController {
    private final BikeService bikeService;

    @Autowired
    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping("")
    public String getBikes(Model model) {
        model.addAttribute("bikes", bikeService.getBikes());
        return "bikesPage";
    }

    @GetMapping("/{id}")
    public String getBikeById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("bike", bikeService.getBikeById(id));
        return "bikePage";
    }

    @GetMapping("/add")
    public String addBike(Model model) {
        model.addAttribute("bike", new Bike());
        return "addBike";
    }

    @PostMapping("/addBike")
    public String addBike(Bike bike) {
        bikeService.addBike(bike);
        return "redirect:/bikes";
    }

    @GetMapping("/deleteBike/{id}")
    public String deleteBike(@PathVariable("id") Long id) {
        bikeService.deleteBike(id);
        return "redirect:/bikes";
    }
}



