package com.marvingcdev.Metro.CDMX.Station;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stations")
public class StationController {
    @Autowired
    private StationRepository stationRepository;
    @GetMapping
    public List<Station> getAllStations(){
        return stationRepository.findAll();
    }
    @GetMapping("/search")
    public List<Station> searchProducts(@RequestParam("name") String name) {
        return stationRepository.searchByName(name);
    }
}
