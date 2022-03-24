package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.BoMon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface BoMonRepository extends JpaRepository<BoMon, String> {
    public default List<BoMon> danhSachBoMon(String maKhoa) {
        ArrayList<BoMon> list = (ArrayList<BoMon>) this.findAll();
        ArrayList<BoMon> listrepo = new ArrayList<>();
        System.out.println(maKhoa);
        list.forEach(boMon -> {
            if (boMon.getKhoa().getMaKhoa().equals(maKhoa)) {
                listrepo.add(boMon);
            }
        });
        return listrepo;
    }
}
