
package com.zensar.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.student.entity.MenuEntity;
@Repository
public interface MenuRepo extends JpaRepository<MenuEntity, Integer> {
}
