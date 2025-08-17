package baiTH_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SinhVien> sinhViens= new ArrayList<>();
        sinhViens.add(new SinhVien("2024609206", "Nguyen Hai Ninh", 8.0, new LopHoc("HTTT02",1)));
        sinhViens.add(new SinhVien("2024609207", "Bui The Thinh", 6.0, new LopHoc("HTTT02",1)));
        sinhViens.add(new SinhVien("2024609208", "Dao Quang Trung", 7.0, new LopHoc("HTTT02",1)));

        for (SinhVien sinhVien : sinhViens) {
            System.out.println(sinhVien);
        }


    }

}