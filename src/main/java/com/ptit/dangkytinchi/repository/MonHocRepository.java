package com.ptit.dangkytinchi.repository;

import com.ptit.dangkytinchi.model.MonHoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MonHocRepository  extends JpaRepository<MonHoc, String> {
    public default ArrayList<MonHoc> timMonHocTheoMaBoMon(String maBoMon){
        ArrayList<MonHoc> list = (ArrayList<MonHoc>) this.findAll();
        ArrayList<MonHoc> listRespon = new ArrayList<>();
        list.forEach(monHoc -> {
            if(monHoc.getBoMon().getMaBoMon().equals(maBoMon)){
                listRespon.add(monHoc);
            }
        });
        return  listRespon;
    }
}
