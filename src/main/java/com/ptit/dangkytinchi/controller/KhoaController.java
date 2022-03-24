package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.model.Khoa;
import com.ptit.dangkytinchi.model.SinhVien;
import com.ptit.dangkytinchi.repository.KhoaRepository;
import com.ptit.dangkytinchi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/khoa", produces = "application/json")
@CrossOrigin(origins = "*")
public class KhoaController {
    private KhoaRepository khoaRepo;

    @Autowired
    public KhoaController(KhoaRepository khoaRepo) {
        this.khoaRepo = khoaRepo;
    }

    @GetMapping("/danhsach")
    public List<Khoa> danhSachTaiKhoan() {
        return khoaRepo.findAll();
    }
}
