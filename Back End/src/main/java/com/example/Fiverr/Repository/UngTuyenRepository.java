package com.example.Fiverr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Fiverr.Model.CONGVIEC;
import com.example.Fiverr.Model.UNGTUYEN;

@Repository
public interface UngTuyenRepository extends JpaRepository<UNGTUYEN, Long>{
    boolean existsByCvIdAndCongviecId(Long cvId, Long congviecId);
    List<UNGTUYEN> findByCongviec_Id(Long congviecId);
    List<UNGTUYEN> findByCvId(Long cvId);
}
