package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.DTO.MonHocDTO;
import com.ptit.dangkytinchi.DTO.SinhVienDTO;
import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.model.BoMon;
import com.ptit.dangkytinchi.model.MonHoc;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.model.SinhVienKhoa;
import com.ptit.dangkytinchi.repository.BoMonRepository;
import com.ptit.dangkytinchi.repository.MonHocRepository;
import com.ptit.dangkytinchi.repository.SinhVienKhoaRepository;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/sinhvienkhoa", produces = "application/json")
@CrossOrigin(origins = "*")
public class SinhVienKhoaController {
    @Autowired
    private SinhVienKhoaRepository svRepo;
    @Autowired
    private BoMonRepository bomonRepo;
    @Autowired
    private MonHocRepository monhocRepo;

    public SinhVienKhoaController(SinhVienKhoaRepository svRepo, BoMonRepository bmRepo, MonHocRepository monhocRepo) {
        this.svRepo = svRepo;
        this.bomonRepo = bmRepo;
        this.monhocRepo = monhocRepo;
    }

    @GetMapping("/danhsach")
    public List<SinhVienKhoa> danhSachSinhVienKhoa() {
        return svRepo.findAll();
    }
    @PostMapping("/monhoc")
    public ResponeAPI layKhoaTheoMaSinhVien(@RequestBody SinhVienDTO sinhVienDTO){
        ResponeAPI res = new ResponeAPI();
        ArrayList<SinhVienKhoa>  list = (ArrayList<SinhVienKhoa>) svRepo.findAll();
        for (SinhVienKhoa svk : list) {
            if (svk.getSinhVien().getMaSinhVien().equals(sinhVienDTO.getMaSinhVien())) {
                ArrayList<BoMon> listBomon = (ArrayList<BoMon>) bomonRepo.danhSachBoMon(svk.getKhoa().getMaKhoa());
                ArrayList<MonHocDTO> listMonHoc = new ArrayList<>();
                if (listBomon.size() > 0){
                    listBomon.forEach(boMon -> {
                        ArrayList<MonHoc> listdem = monhocRepo.timMonHocTheoMaBoMon(boMon.getMaBoMon());
                        listdem.forEach(monHoc -> {
                            MonHocDTO mhDTO = new MonHocDTO(monHoc.getMaMonHoc(), monHoc.getTenMonHoc(), monHoc.getSoTc(), monHoc.getBoMon().getMaBoMon());
                            listMonHoc.add(mhDTO);
                        });
                    });
                }
                res.setData(listMonHoc);
                return res;
            }
        }
        res.setError("Mã sinh viên sai");
        return res;
    }
}
