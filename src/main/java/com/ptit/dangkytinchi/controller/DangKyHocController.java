package com.ptit.dangkytinchi.controller;

import com.ptit.dangkytinchi.exception.ResponeAPI;
import com.ptit.dangkytinchi.model.DangKyHoc;
import com.ptit.dangkytinchi.repository.DangKyHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dangkytinchi", produces = "application/json")
@CrossOrigin("*")
public class DangKyHocController {

    private DangKyHoc dangKyHoc;

    @Autowired
    private DangKyHocRepository dangKyHocRepository;

    public DangKyHocController(DangKyHocRepository dangKyHocRepository) {
        this.dangKyHocRepository = dangKyHocRepository;
    }

    @PostMapping("/luudangky")
    private ResponeAPI luuDangKy(){
        ResponeAPI res = new ResponeAPI();

        return res;

    }



}
