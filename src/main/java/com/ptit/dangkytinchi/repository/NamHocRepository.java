package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.NamHoc;
import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NamHocRepository  extends JpaRepository<NamHoc, String> {
    NamHoc findNamHocByMaNamHocEndsWith(String namhoc);
}
