package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.DangKyHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DangKyHocRepository extends JpaRepository<DangKyHoc, String> {
}
