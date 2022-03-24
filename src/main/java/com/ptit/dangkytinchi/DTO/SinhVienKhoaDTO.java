package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.DangKyHoc;
import com.ptit.dangkytinchi.model.Khoa;
import com.ptit.dangkytinchi.model.SinhVien;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
public class SinhVienKhoaDTO {
    private String maSinhVienKhoa;
    private  String nienKhoa;
    private boolean dangHoc;
    private Khoa khoa;
    List<DangKyHoc> dsDangKyHoc;
    private SinhVien sinhVien;

}
