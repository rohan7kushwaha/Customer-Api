

  package com.zensar.student.repository;
  import com.zensar.student.entity.CustomerOrderEntity;
  import org.springframework.data.jpa.repository.JpaRepository;
  import org.springframework.stereotype.Repository;

  @Repository
  public interface CustomerOrderRepo extends JpaRepository<CustomerOrderEntity, Integer> {

  }
 