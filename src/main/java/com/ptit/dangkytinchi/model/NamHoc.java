package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_nam_hoc", schema = "dangkytinchi")
public class NamHoc {

    @Id
    @Column(name = "manamhoc")
    private String maNamHoc;

    @Column(name="tennamhoc")
    private String tenNamHoc;

    @Column(name="mota")
    private String moTa;

    @JsonBackReference
    @OneToMany(mappedBy = "namHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<KiHoc> dsKiHoc;
}
