package baiTH_2;

public class Main {
            public static void main(String[] args){

                QuanLy quanLy = new QuanLy();


                NhanVien a = new NhanVien("01","A","A@",25,"0111111111");
                NhanVien b = new NhanVien("02","B","@B",24,"0222222222");
                NhanVien c = new NhanVienFullTime("03", "C", "C@",22, "0333333333", 3333, 333);
                NhanVien d = new NhanVienFullTime("04", "D", "D@",21, "0444444444", 4444,444 );
                NhanVien e = new NhanVienPartTime("04","E","E@",20,"0555555555",40,23);


                quanLy.themNhanVien(a);
                quanLy.themNhanVien(b);
                quanLy.themNhanVien(c);
                quanLy.themNhanVien(d);
                quanLy.themNhanVien(e);


                quanLy.inThongTin();


                quanLy.tongTienLuong();
            }
        }
