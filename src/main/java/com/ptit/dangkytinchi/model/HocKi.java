package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_hoc_ki", schema = "dangkytinchi")
public class HocKi {
    @Id
    @Column(name="mahocki")
    private String maHocKi;

    @Column(name="tenhocki")
    private String tenHocKi;

    @Column(name="mota")
    private String moTa;

    @JsonBackReference
    @OneToMany(mappedBy = "hocKi", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<KiHoc> dsKiHoc;
}
