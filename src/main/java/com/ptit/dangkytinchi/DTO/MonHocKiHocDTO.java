package com.ptit.dangkytinchi.DTO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ptit.dangkytinchi.model.KiHoc;
import com.ptit.dangkytinchi.model.LopHocPhan;
import com.ptit.dangkytinchi.model.MonHoc;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class MonHocKiHocDTO {

    private String maMocHocKiHoc;
    private MonHocDTO monHoc;
    private KiHocDTO kiHoc;
    Set<LopHocPhanDTO> dsLopHocPhan;
}

