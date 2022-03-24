package com.ptit.dangkytinchi.DTO;

import com.ptit.dangkytinchi.model.*;
import lombok.Data;


@Data
public class LichHocDTO {
    private String maLichHoc;
    private String tenLichHoc;
    private String giangvien;
    private LopHocPhan lopHocPhan;
    private PhongHoc phongHoc;
    private TuanHoc tuanHoc;
    private NgayHoc ngayHoc;
    private KipHoc kipHoc;

    public LichHocDTO(String maLichHoc, String tenLichHoc, String giangvien, LopHocPhan lopHocPhan,
                      PhongHoc phongHoc, TuanHoc tuanHoc, NgayHoc ngayHoc, KipHoc kipHoc) {
        this.maLichHoc = maLichHoc;
        this.tenLichHoc = tenLichHoc;
        this.giangvien = giangvien;
        this.lopHocPhan = lopHocPhan;
        this.phongHoc = phongHoc;
        this.tuanHoc = tuanHoc;
        this.ngayHoc = ngayHoc;
        this.kipHoc = kipHoc;
    }
}
