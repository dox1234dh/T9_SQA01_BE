package com.ptit.dangkytinchi.DTO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ptit.dangkytinchi.model.LichHoc;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class KipHocDTO {
    private String maKipHoc;
    private String tenKipHoc;
    private String moTa;
    Set<LichHoc> dsLichHoc;
}
