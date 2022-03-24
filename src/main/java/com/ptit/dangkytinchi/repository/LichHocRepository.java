package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.LichHoc;
import com.ptit.dangkytinchi.model.LopHocPhan;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface LichHocRepository  extends JpaRepository<LichHoc, String> {
    List<LichHoc> findLichHocByMaLichHoc(String maLichHoc);
    ArrayList<LichHoc> findLichHocByLopHocPhan_MaLopHocPhan(String maLopHocPhan);
}
