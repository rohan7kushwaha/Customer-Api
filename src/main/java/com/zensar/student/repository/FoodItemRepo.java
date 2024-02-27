
package com.zensar.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.student.entity.FoodItemEntity;
@Repository
public interface FoodItemRepo extends JpaRepository<FoodItemEntity, Integer> {
}
