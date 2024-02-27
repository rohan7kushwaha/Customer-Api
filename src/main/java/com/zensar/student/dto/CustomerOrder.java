package com.zensar.student.dto;

import com.zensar.student.entity.CustomerOrderEntity;
import com.zensar.student.entity.FoodItemEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerOrder{
   private int id;
   private String customerName;
   @Setter
   private List<FoodItem> foodItems;


}
