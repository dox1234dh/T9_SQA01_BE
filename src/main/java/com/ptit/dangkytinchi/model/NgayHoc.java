package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_ngay_hoc", schema = "dangkytinchi")
public class NgayHoc {

    @Id
    @Column(name = "mangayhoc")
    private String maNgayHoc;

    @Column(name="tenngayhoc")
    private String tenNgayHoc;

    @Column(name="mota")
    private String moTa;

    @JsonBackReference
    @OneToMany(mappedBy = "ngayHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<LichHoc> dsLichHoc;
}
