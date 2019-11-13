package com.gaponec.service;

import com.gaponec.entity.City;
import reactor.core.publisher.Flux;

public interface CityService {
  Flux<City> loadCities();
}
