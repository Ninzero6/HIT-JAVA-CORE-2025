package baiTH_2;

public class NhanVienFullTime extends NhanVien{

    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String ten, String email, int tuoi, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, ten, email, tuoi, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(){

    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + tienThuong;
    }
    @Override
    public void hienThongTin() {
        System.out.println("LOAI: FULLTIME");
        super.hienThongTin();
        System.out.println("tien luong la " + luongCoBan);
        System.out.println("tien thuong la " + tienThuong);

        System.out.println("Luong: " + tinhLuong());
    }
}
