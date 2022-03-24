
package com.ptit.dangkytinchi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_toa_nha", schema = "dangkytinchi")
public class ToaNha {

    @Id
    @Column(name = "matoanha")
    private String maToaNha;

    @Column(name = "tentoanha")
    private String tenToaNha;

    @Column(name = "mota")
    private String moTa;

    @JsonBackReference
    @OneToMany(mappedBy = "toaNha", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<PhongHoc> dsPhongHoc;



}

