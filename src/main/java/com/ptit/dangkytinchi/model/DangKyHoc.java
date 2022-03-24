package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_dang_ky_hoc", schema = "dangkytinchi")
public class DangKyHoc {
    @Id
    @Column(name="madangkyhoc")
    private String maDangKyHoc;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "masinhvienkhoa", nullable = false)
    private SinhVienKhoa sinhVienKhoa;
}
