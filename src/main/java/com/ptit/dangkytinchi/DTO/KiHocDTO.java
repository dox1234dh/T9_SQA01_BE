package com.ptit.dangkytinchi.DTO;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ptit.dangkytinchi.model.HocKi;
import com.ptit.dangkytinchi.model.MonHocKiHoc;
import com.ptit.dangkytinchi.model.NamHoc;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class KiHocDTO {
    private String maKiHoc;
    private boolean dangHoc;
    private boolean dangDangKy;
    private NamHoc namHoc;
    private HocKi hocKi;
    Set<MonHocKiHoc> dsMonHocKiHoc;
}
