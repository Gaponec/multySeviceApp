package com.gaponec.controller;

import com.gaponec.entity.City;
import com.gaponec.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class CityController {
  private CityService cityService;

  @GetMapping(value = "/cities", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<City> cities() {
    return cityService.loadCities().log();
  }
}
