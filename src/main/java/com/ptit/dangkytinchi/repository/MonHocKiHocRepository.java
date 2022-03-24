package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.MonHocKiHoc;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonHocKiHocRepository  extends JpaRepository<MonHocKiHoc, String> {
    List<MonHocKiHoc> findMonHocKiHocByKiHoc_MaKiHocAndMonHoc_MaMonHoc(String maKiHoc, String MaMonHoc);
}
