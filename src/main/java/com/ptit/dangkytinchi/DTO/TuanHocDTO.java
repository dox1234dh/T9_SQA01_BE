package com.ptit.dangkytinchi.DTO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ptit.dangkytinchi.model.LichHoc;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class TuanHocDTO {
    private String maTuanHoc;
    private String tenTuanHoc;
    private String moTa;
    Set<LichHoc> dsLichHoc;
}
