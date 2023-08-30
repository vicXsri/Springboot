package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CarEntity;
@Repository
public interface CarsRepository extends JpaRepository<CarEntity, Integer> {

}
