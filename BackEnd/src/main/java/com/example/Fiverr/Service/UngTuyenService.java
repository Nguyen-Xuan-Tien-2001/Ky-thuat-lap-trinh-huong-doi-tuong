package com.example.Fiverr.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Fiverr.Model.CV;
import com.example.Fiverr.Model.DIACHI;
import com.example.Fiverr.Model.UNGTUYEN;
import com.example.Fiverr.Repository.UngTuyenRepository;

@Service
public class UngTuyenService {
    @Autowired
    private UngTuyenRepository ungtuyenRepo;

    public boolean existsWithMaCVAndMaCViec(Long cvId, Long congviecId) {
        return ungtuyenRepo.existsByCvIdAndCongviecId(cvId, congviecId);
    }

    public UNGTUYEN createUT(UNGTUYEN ungtuyen) {
        return ungtuyenRepo.save(ungtuyen);
    }

    public List<UNGTUYEN> getAllUT() {
        return (List<UNGTUYEN>) ungtuyenRepo.findAll();
    }

    public UNGTUYEN getUTById(Long id) {
        return ungtuyenRepo.findById(id).orElse(null);
    }
    public UNGTUYEN updateUT(Long id, UNGTUYEN ungtuyen) {
        return ungtuyenRepo.save(ungtuyen);
    }

    public void deleteUT(Long id){
        ungtuyenRepo.deleteById(id);
    }
    
    public List<UNGTUYEN> findUngtuyenByCongviecId(Long congviecId) {
        return ungtuyenRepo.findByCongviec_Id(congviecId);
    }

    public List<UNGTUYEN> findUngtuyenByCVId(Long CVId) {
        return ungtuyenRepo.findByCvId(CVId);
    }
}
