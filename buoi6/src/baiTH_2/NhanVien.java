package baiTH_2;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien(String maNV, String ten, String email, int tuoi, String soDienThoai) {
        this.maNV = maNV;
        this.ten = ten;
        this.email = email;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
    }
    public NhanVien(){

    }

    public void hienThongTin() {
        System.out.println("maNV:" + this.maNV + " tenNV:" + this.ten + " tuoi:" + this.tuoi + " email:" + this.email + " soDienthoai:" + this.soDienThoai);
        System.out.println("Luong: " + tinhLuong());
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong(){
        return 0;
    }

}
