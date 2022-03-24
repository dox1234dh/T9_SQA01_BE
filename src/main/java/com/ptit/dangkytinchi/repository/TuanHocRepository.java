package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.TuanHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuanHocRepository extends JpaRepository<TuanHoc, String> {

}
