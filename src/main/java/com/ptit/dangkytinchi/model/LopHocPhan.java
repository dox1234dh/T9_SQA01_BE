package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_lop_hoc_phan", schema = "dangkytinchi")
public class LopHocPhan {

    @Id
    @Column(name="malophocphan")
    private String maLopHocPhan;

    @Column(name="tenlophocphan")
    private String tenLopHocPhan;

    @Column(name="sisotoida")
    private int siSoToiDa;

    @Column(name="sisothucte")
    private int siSoThucTe;

    @Column(name="mota")
    private String moTa;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "mamonhockihoc", nullable = false)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private MonHocKiHoc monHocKiHoc;

    @JsonBackReference
    @OneToMany(mappedBy = "lopHocPhan", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LichHoc> dsLichHoc;
}
