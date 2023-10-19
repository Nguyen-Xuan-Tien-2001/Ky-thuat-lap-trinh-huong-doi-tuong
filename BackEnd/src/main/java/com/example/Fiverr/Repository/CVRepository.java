package com.example.Fiverr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Fiverr.Model.CV;
@Repository
public interface CVRepository extends JpaRepository<CV, Long>{
    List<CV> findByUserId(Long userId);
}
