package com.ptit.dangkytinchi.controller;


import com.ptit.dangkytinchi.model.*;
import com.ptit.dangkytinchi.repository.KiHocRepository;
import com.ptit.dangkytinchi.repository.LichHocRepository;
import com.ptit.dangkytinchi.repository.MonHocKiHocRepository;
import com.ptit.dangkytinchi.repository.SinhVienKhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/lichhoc", produces = "application/json")
@CrossOrigin("*")
public class LichHocController {
    private KiHoc kiHoc;

    @Autowired
    private LichHocRepository lichHocRepository;
    @Autowired
    private SinhVienKhoaRepository sinhVienKhoaRepository;
    @Autowired
    private MonHocKiHocRepository monHocKiHocRepository;
    @Autowired
    private KiHocRepository kiHocRepository;

    public LichHocController(LichHocRepository lichHocRepository,
                             SinhVienKhoaRepository sinhVienKhoaRepository,
                             MonHocKiHocRepository monHocKiHocRepository,
                             KiHocRepository kiHocRepository) {
        this.lichHocRepository = lichHocRepository;
        this.sinhVienKhoaRepository = sinhVienKhoaRepository;
        this.monHocKiHocRepository = monHocKiHocRepository;
        this.kiHocRepository = kiHocRepository;
    }

    @GetMapping("/danhsach/{id}")
    private List<LichHoc> getLHByMaLHP(@PathVariable("id") String id){
        return lichHocRepository.findLichHocByLopHocPhan_MaLopHocPhan(id);
    }

    @GetMapping("/danhsach")
    private List<MonHocKiHoc> getLH() {
       // List<MonHocKiHoc> result = new List<MonHocKiHoc>();
//        Date date = new Date();
//        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        int thang = localDate.getMonthValue();
//        int nam = localDate.getYear();
//
//        SinhVienKhoa sinhVienKhoa = sinhVienKhoaRepository.findSinhVienKhoaBySinhVien_MaSinhVien("B18DCCN147");
//        System.out.println(sinhVienKhoa.getNienKhoa()+"");
//        int nienKhoa=Integer.parseInt(sinhVienKhoa.getNienKhoa().substring(0,4));
//            kiHoc = new KiHoc();
//            String maKiHoc = "";
//        if(nam-nienKhoa == 0){
//            maKiHoc="KYHOC01";
//
//        }else if(nam-nienKhoa == 1){
//            //hoc ki 2
//            if(thang <=7 && thang >=2){
//                maKiHoc="KYHOC02";
//            }
//            //hoc ki he
//            else if(thang <=9 && thang >=7){
//
//            }
//            //hoc ki 1
//            else{
//                maKiHoc="KYHOC03";
//            }
//
//        }
//        else if(nam-nienKhoa == 2){
//            //hoc ki 2
//            if(thang <=7 && thang >=2){
//                maKiHoc="KYHOC04";
//            }
//            //hoc ki he
//            else if(thang <=9 && thang >=7){
//
//            }
//            //hoc ki 1
//            else{
//                maKiHoc="KYHOC05";
//            }
//
//        }else if(nam-nienKhoa == 3){
//            //hoc ki 2
//            if(thang <=7 && thang >=2){
//                maKiHoc="KYHOC06";
//            }
//            //hoc ki he
//            else if(thang <=9 && thang >=7){
//
//            }
//            //hoc ki 1
//            else{
//                maKiHoc="KYHOC07";
//            }
//
//        }else if(nam-nienKhoa == 4){
//            //hoc ki 2
//            if(thang <=7 && thang >=2){
//                maKiHoc="KYHOC08";
//            }
//            //hoc ki he
//            else if(thang <=9 && thang >=7){
//
//            }
//            //hoc ki 1
//            else{
//
//            }
//        }
//        kiHoc = kiHocRepository.findKiHocByMaKiHoc(maKiHoc);

        //return lichHocRepository.findAll();
        //return monHocKiHocRepository.findMonHocKiHocByKiHoc_MaKiHoc(maKiHoc);
        return null;
    }
}
