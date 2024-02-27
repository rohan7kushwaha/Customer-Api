package com.zensar.student.entity;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zensar.student.dto.FoodItem;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "customer_name")
    private String customerName;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "customerOrder", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<FoodItemEntity> foodItems;

}
