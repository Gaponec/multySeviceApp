package com.gaponec.repository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cities")
public class CityDocument {
  @Id
  private String id;
  private String name;
}
