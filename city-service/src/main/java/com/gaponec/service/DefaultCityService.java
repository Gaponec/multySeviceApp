package com.gaponec.service;

import com.gaponec.entity.City;
import com.gaponec.mapper.CityMapper;
import com.gaponec.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class DefaultCityService implements CityService {

  private CityRepository cityRepository;
  private CityMapper cityMapper;

  @Override
  public Flux<City> loadCities() {
    return cityRepository.findAll()
        .map(cityMapper::cityDocumentToCity);
  }
}
