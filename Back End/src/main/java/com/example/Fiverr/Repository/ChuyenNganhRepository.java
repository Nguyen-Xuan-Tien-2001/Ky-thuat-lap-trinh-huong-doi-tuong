package com.example.Fiverr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Fiverr.Model.CHUYENNGANH;
@Repository
public interface ChuyenNganhRepository extends JpaRepository<CHUYENNGANH, Long>{
    
}
