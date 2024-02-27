 // Source code is unavailable, and was generated by the Fernflower decompiler.
package com.zensar.student.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zensar.student.dto.CustomerOrder;
import com.zensar.student.dto.FoodItem;
import jakarta.persistence.*;
import lombok.*;

 @Entity
@Table (name = "food_items")
@Data
 @NoArgsConstructor
 @AllArgsConstructor
 @ToString
public class FoodItemEntity extends FoodItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;
    @Column(name = "menu_id")
    private int menuId;
    @Column(name = "quantity")
   private int quantity;

    @Setter
    @JsonBackReference
    @ManyToOne
     @JoinColumn(name = "Order_id")
     @EqualsAndHashCode.Exclude
     @ToString.Exclude
     private CustomerOrderEntity customerOrder;



 }