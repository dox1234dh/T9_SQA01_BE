package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.ToaNha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToaNhaRepository extends JpaRepository<ToaNha, String> {
}
