package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.KiHoc;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KiHocRepository  extends JpaRepository<KiHoc, String> {
    KiHoc findKiHocByMaKiHoc(String maKiHoc);
    KiHoc findKiHocByNamHoc_MaNamHocAndHocKi_MaHocKi(String maNamHoc, String MaHocKi);
}
