package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_kip_hoc", schema = "dangkytinchi")
public class KipHoc {

    @Id
    @Column(name="makiphoc")
    private String maKipHoc;

    @Column(name="tenkiphoc")
    private String tenKipHoc;

    @Column(name="mota")
    private String moTa;

    @JsonBackReference
    @OneToMany(mappedBy = "kipHoc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<LichHoc> dsLichHoc;

}
