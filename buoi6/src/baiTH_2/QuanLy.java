package baiTH_2;

    import java.util.*;
    public class QuanLy {
        private ArrayList<NhanVien> danhSachNhanVien;

        public  QuanLy() {
            danhSachNhanVien = new ArrayList<>();
        }
        public void themNhanVien(NhanVien nhanVien){
            danhSachNhanVien.add( nhanVien );

        }
        public void inThongTin(){
            System.out.println( " ----------------DANH SACH NHAN VIEN------------");
            for (NhanVien nhanvien : danhSachNhanVien) {
                nhanvien.hienThongTin();
            }
            System.out.println( " ------------------------------------");
        }
        public void tongTienLuong(){
            double sum=0;
            for(NhanVien nhanvien:danhSachNhanVien){
                sum+=nhanvien.tinhLuong();
            }
            System.out.println("Tong tien luong la: "+ sum);
        }

    }
