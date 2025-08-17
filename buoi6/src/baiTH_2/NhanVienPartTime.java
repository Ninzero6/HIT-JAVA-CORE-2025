package baiTH_2;

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String ten, String email, int tuoi, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNV, ten, email, tuoi, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public NhanVienPartTime(){

    }

    @Override
    public double tinhLuong() {
        return soGioLam*luongTheoGio;
    }
    @Override
    public void hienThongTin() {
        System.out.println("LOAI: PARTTIME");
        super.hienThongTin();
        System.out.println("so GIO LAM LA " + soGioLam);
        System.out.println("tien luong la " + luongTheoGio);
        System.out.println("Luong: " + tinhLuong());
    }
}
