package com.ptit.dangkytinchi.controller;


import com.ptit.dangkytinchi.DTO.*;
import com.ptit.dangkytinchi.model.*;
import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@RestController
@RequestMapping(path = "/dangkytinchi", produces = "application/json")
@CrossOrigin(origins = "*")
public class LopHocPhanController {

    @Autowired
    private LopHocPhanRepository lopHocPhanRepository;
    @Autowired
    private MonHocKiHocRepository monHocKiHocRepository;
    @Autowired
    private SinhVienKhoaRepository sinhVienKhoaRepository;
    @Autowired
    private KiHocRepository KiHocRepository;
    @Autowired
    private LichHocRepository lichHocRepository;


    public LopHocPhanController(LopHocPhanRepository lopHocPhanRepository, MonHocKiHocRepository monHocKiHocRepository,
                                SinhVienKhoaRepository sinhVienKhoaRepository,
                                com.ptit.dangkytinchi.repository.KiHocRepository kiHocRepository,
                                LichHocRepository lichHocRepository) {
        this.lopHocPhanRepository = lopHocPhanRepository;
        this.monHocKiHocRepository = monHocKiHocRepository;
        this.sinhVienKhoaRepository = sinhVienKhoaRepository;
        KiHocRepository = kiHocRepository;
        this.lichHocRepository = lichHocRepository;
    }

    @GetMapping("/lophocphan/{maMonHoc}")
    private ResponeAPI getLopHocPhanByMonHoc(@PathVariable("maMonHoc") String maMonHoc) {
        ResponeAPI res = new ResponeAPI();
        ArrayList<LopHocPhanDTO> dsLHPDTO = new ArrayList<LopHocPhanDTO>();
        ArrayList<LichHocDTO> dsLHDTO = new ArrayList<LichHocDTO>();
        ArrayList<MonHocKiHoc> monHocKiHoc = new ArrayList<MonHocKiHoc>();
        ArrayList<LopHocPhan> dsLopHocPhan = new ArrayList<LopHocPhan>();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int thang = localDate.getMonthValue();
        int nam = localDate.getYear();

        SinhVienKhoa sinhVienKhoa = sinhVienKhoaRepository.findSinhVienKhoaBySinhVien_MaSinhVien("B18DCCN147");
        System.out.println(sinhVienKhoa.getNienKhoa() + "");
        int nienKhoa = Integer.parseInt(sinhVienKhoa.getNienKhoa().substring(0, 4));
        String maKiHoc = "";
        if (nam - nienKhoa == 0) {
            maKiHoc = "KYHOC01";

        } else if (nam - nienKhoa == 1) {
            //hoc ki 2
            if (thang <= 7 && thang >= 2) {
                maKiHoc = "KYHOC02";
            }
            //hoc ki he
            else if (thang <= 9 && thang >= 7) {

            }
            //hoc ki 1
            else {
                maKiHoc = "KYHOC03";
            }

        } else if (nam - nienKhoa == 2) {
            //hoc ki 2
            if (thang <= 7 && thang >= 2) {
                maKiHoc = "KYHOC04";
            }
            //hoc ki he
            else if (thang <= 9 && thang >= 7) {

            }
            //hoc ki 1
            else {
                maKiHoc = "KYHOC05";
            }

        } else if (nam - nienKhoa == 3) {
            //hoc ki 2
            if (thang <= 7 && thang >= 2) {
                maKiHoc = "KYHOC06";
            }
            //hoc ki he
            else if (thang <= 9 && thang >= 7) {

            }
            //hoc ki 1
            else {
                maKiHoc = "KYHOC07";
            }

        } else if (nam - nienKhoa == 4) {
            //hoc ki 2
            if (thang <= 7 && thang >= 2) {
                maKiHoc = "KYHOC08";
            }
            //hoc ki he
            else if (thang <= 9 && thang >= 7) {

            }
            //hoc ki 1
            else {

            }
        }
        monHocKiHoc = (ArrayList<MonHocKiHoc>) monHocKiHocRepository.findMonHocKiHocByKiHoc_MaKiHocAndMonHoc_MaMonHoc(maKiHoc, maMonHoc);
        dsLopHocPhan = (ArrayList<LopHocPhan>) lopHocPhanRepository.findLopHocPhanByMonHocKiHoc_MaMocHocKiHoc(monHocKiHoc.get(0).getMaMocHocKiHoc());
        for(int i=0; i<dsLopHocPhan.size(); i++){
            String maLHP= dsLopHocPhan.get(i).getMaLopHocPhan();
            LopHocPhan tempLHP = dsLopHocPhan.get(i);
            ArrayList<LichHoc> dsLichHoc = new ArrayList<LichHoc>();
            dsLichHoc= lichHocRepository.findLichHocByLopHocPhan_MaLopHocPhan(maLHP);
            ArrayList<LichHocDTO> dsLH_DTO = new ArrayList<LichHocDTO>();
            LopHocPhanDTO tempLHP_DTO = new LopHocPhanDTO(tempLHP.getMaLopHocPhan(),tempLHP.getTenLopHocPhan(),
                    tempLHP.getSiSoToiDa(), tempLHP.getSiSoThucTe(), tempLHP.getMoTa(), tempLHP.getMonHocKiHoc(), dsLichHoc);
            dsLHPDTO.add(tempLHP_DTO);
        }
            res.setData(dsLHPDTO);

        return res;
    }

    @PostMapping("/")
    private ResponeAPI getMonHoc(@RequestBody SinhVienDTO sinhVienDTO) {
        ResponeAPI res = new ResponeAPI();


        return res;
    }


}
