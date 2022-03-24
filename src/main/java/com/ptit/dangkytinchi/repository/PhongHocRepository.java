package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.PhongHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongHocRepository extends JpaRepository<PhongHoc, String> {
}
