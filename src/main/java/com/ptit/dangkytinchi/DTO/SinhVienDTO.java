package com.ptit.dangkytinchi.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class SinhVienDTO implements Serializable {
    private String maSinhVien;
    private String tenSinhVien;
    private String taiKhoan;
    private String matKhau;
    private String matKhauMoi;
}
