package com.gaponec.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CityRepository extends ReactiveMongoRepository<CityDocument, String> {
}
