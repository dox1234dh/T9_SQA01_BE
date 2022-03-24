package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

import static org.hibernate.annotations.FetchMode.SELECT;
@Data
@Entity
@Table(name = "tbl_sinh_vien_khoa", schema = "dangkytinchi")
public class SinhVienKhoa {

    @Id
    @Column(name = "masinhvienkhoa")
    private String maSinhVienKhoa;

    @Column(name = "nienkhoa")
    private  String nienKhoa;

    @Column(name = "danghoc")
    private boolean dangHoc;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="makhoa", nullable = false)
    private Khoa khoa;

    @JsonBackReference
    @OneToMany(mappedBy = "sinhVienKhoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<DangKyHoc> dsDangKyHoc;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "masinhvien", nullable = false)
    private SinhVien sinhVien;

}
