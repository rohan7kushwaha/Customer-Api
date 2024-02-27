
package com.zensar.student.entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
   private int id;
   @Column(name = "name")
   private String name;
   @Column(name = "type")
   private String type;
   @Column(name = "price")
   private double price;


}
