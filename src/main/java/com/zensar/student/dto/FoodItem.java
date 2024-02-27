package com.zensar.student.dto;

import com.zensar.student.entity.CustomerOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodItem {
	private int id;
   private int menuId;
   private int quantity;
}
