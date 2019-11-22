package com.example.demo.repository;

import com.example.demo.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

    public Resource findResourceById(Long id);

    public Resource findResourceByLevel(String level);
}
