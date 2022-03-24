package com.ptit.dangkytinchi.DTO;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ptit.dangkytinchi.model.LichHoc;
import com.ptit.dangkytinchi.model.ToaNha;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class PhongHocDTO {

    private String maPhongHoc;


    private String tenPhongHoc;


    private int sucChua;


    private ToaNha toaNha;


    Set<LichHoc> dsLichHoc;
}
