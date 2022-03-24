package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_ki_hoc", schema = "dangkytinchi")
public class KiHoc {

    @Id
    @Column(name="makihoc")
    private String maKiHoc;

    @Column(name="danghoc")
    private boolean dangHoc;

    @Column(name="dangdangky")
    private boolean dangDangKy;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "manamhoc", nullable = false)
    private NamHoc namHoc;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "mahocki", nullable = false)
    private HocKi hocKi;

    @JsonBackReference
    @OneToMany(mappedBy = "kiHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<MonHocKiHoc> dsMonHocKiHoc;
}
