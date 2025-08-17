package baiTH_1;

public class LopHoc {
    private String tenLop;
    private int maLop;

    public LopHoc(String tenLop, int maLop) {
        this.tenLop = tenLop;
        this.maLop = maLop;
    }
    public LopHoc(){

    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return "tenLop:'" + tenLop + '\'' +
                ", maLop:" + maLop +
                '.';
    }
}
