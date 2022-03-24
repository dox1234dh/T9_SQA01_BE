package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.LopHocPhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocPhanRepository extends JpaRepository<LopHocPhan, String> {
    List<LopHocPhan> findLopHocPhanByMonHocKiHoc_MaMocHocKiHoc(String maMonHocKiHoc);
}
