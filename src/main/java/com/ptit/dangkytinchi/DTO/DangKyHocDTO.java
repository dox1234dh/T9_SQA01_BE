package com.ptit.dangkytinchi.DTO;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class DangKyHocDTO {

    private String maDangKyHoc;
    private SinhVienKhoa sinhVienKhoa;
}
