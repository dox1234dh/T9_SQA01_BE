package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.LichHoc;
import com.ptit.dangkytinchi.model.MonHocKiHoc;
import lombok.Data;

import java.util.ArrayList;

@Data
public class LopHocPhanDTO {
    private String maLopHocPhan;
    private String tenLopHocPhan;
    private int siSoToiDa;
    private int siSoThucTe;
    private String moTa;
    private MonHocKiHoc monHocKiHoc;
    ArrayList<LichHoc> dsLichHoc;

    public LopHocPhanDTO(String maLopHocPhan, String tenLopHocPhan, int siSoToiDa, int siSoThucTe,
                         String moTa, MonHocKiHoc monHocKiHoc, ArrayList<LichHoc> dsLichHoc) {
        this.maLopHocPhan = maLopHocPhan;
        this.tenLopHocPhan = tenLopHocPhan;
        this.siSoToiDa = siSoToiDa;
        this.siSoThucTe = siSoThucTe;
        this.moTa = moTa;
        this.monHocKiHoc = monHocKiHoc;
        this.dsLichHoc = dsLichHoc;
    }
}
