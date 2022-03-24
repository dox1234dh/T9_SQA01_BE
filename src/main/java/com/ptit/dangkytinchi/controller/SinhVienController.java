package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.DTO.SinhVienDTO;
import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/sinhvien", produces = "application/json")
@CrossOrigin(origins = "*")
public class SinhVienController {
    private SinhVienRepository svRepo;

    @Autowired
    public SinhVienController(SinhVienRepository svRepo) {
        this.svRepo = svRepo;
    }

    @GetMapping("/danhsach")
    public List<SinhVien> danhSachTaiKhoan() {
        return svRepo.findAll();
    }

    @PostMapping("/dangnhap")
    public ResponeAPI dangNhap(@RequestBody SinhVienDTO sinhVienDTO) throws Exception {
        ResponeAPI res = new ResponeAPI();
        SinhVien sv = svRepo.findOneByTaiKhoanAndMatKhau(sinhVienDTO.getTaiKhoan(), sinhVienDTO.getMatKhau());
        if (sv == null) {
            res.setError("Sai tài khoản, mật khẩu.Vui lòng nhập lại!");
        } else {
            SinhVienDTO svDTO = new SinhVienDTO();
            svDTO.setMaSinhVien(sv.getMaSinhVien());
            svDTO.setTenSinhVien(sv.getTenSinhVien());
            svDTO.setTaiKhoan(sv.getTaiKhoan());
            svDTO.setMatKhau(sv.getMatKhau());
            res.setData(svDTO);
        }
        return res;
    }

    @PostMapping("/doimatkhau")
    public ResponeAPI doiMatKhau(@RequestBody SinhVienDTO sinhVienDTO) throws Exception {
        ResponeAPI res = new ResponeAPI();
        SinhVien sv = svRepo.findOneByTaiKhoanAndMatKhau(sinhVienDTO.getTaiKhoan(), sinhVienDTO.getMatKhau());
        if (sv == null) {
            res.setError("Sai mật khẩu cũ.Vui lòng nhập lại!");
        } else {
            SinhVien svMoi = new SinhVien();
            svMoi.setMaSinhVien(sv.getMaSinhVien());
            svMoi.setTenSinhVien(sv.getTenSinhVien());
            svMoi.setTaiKhoan(sv.getTaiKhoan());
            svMoi.setMatKhau(sinhVienDTO.getMatKhauMoi());
            svRepo.save(svMoi);
            res.setData("ok");
        }
        return res;
    }

}
