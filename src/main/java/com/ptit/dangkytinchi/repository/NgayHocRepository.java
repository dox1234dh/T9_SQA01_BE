package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.NgayHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NgayHocRepository extends JpaRepository<NgayHoc, String> {
}
