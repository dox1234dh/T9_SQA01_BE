package com.ptit.dangkytinchi.repository;


import com.ptit.dangkytinchi.model.PhongHoc;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SinhVienKhoaRepository extends JpaRepository<SinhVienKhoa, String> {
    SinhVienKhoa findSinhVienKhoaBySinhVien_MaSinhVien(String maSinhVien);
}
