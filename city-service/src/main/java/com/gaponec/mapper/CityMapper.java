package com.gaponec.mapper;

import com.gaponec.entity.City;
import com.gaponec.repository.CityDocument;
import org.springframework.stereotype.Component;

@Component
public class CityMapper {
  public City cityDocumentToCity(CityDocument cityDocument) {
    return City.builder()
        .name(cityDocument.getName())
        .build();
  }
}
