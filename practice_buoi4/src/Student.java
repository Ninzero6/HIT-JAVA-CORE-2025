import java.time.Year;
public class Student {
    private String name;
    private int nam_sinh;
    private String address;
    private double diem_tx1;
    private double diem_tx2;
    private double diem_KTHP;
    private int tiet_nghi;
    public Student(){

    }
    public Student(String name, int nam_sinh, String address,double diem_tx1,double diem_tx2,double diem_KTHP, int tiet_nghi){
        this.name=name;
        this.nam_sinh=nam_sinh;
        this.address=address;
        this.diem_tx1=diem_tx1;
        this.diem_tx2=diem_tx2;
        this.diem_KTHP=diem_KTHP;
        this.tiet_nghi=tiet_nghi;
    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        int namHientai= Year.now().getValue();
        return namHientai - nam_sinh;
    }

    public String getAddress() {
        return address;
    }

    public double getDiem_tx1() {
        return diem_tx1;
    }

    public double getDiem_tx2() {
        return diem_tx2;
    }

    public double getDiem_KTHP() {
        return diem_KTHP;
    }

    public int getTiet_nghi() {
        return tiet_nghi;
    }
    public double getGPA(){
        return diem_tx1*0.2+diem_tx2*0.3+diem_KTHP*0.5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNam_sinh(int nam_sinh) {
        this.nam_sinh = nam_sinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDiem_tx2(double diem_tx2) {
        this.diem_tx2 = diem_tx2;
    }

    public void setDiem_tx1(double diem_tx1) {
        this.diem_tx1 = diem_tx1;
    }

    public void setDiem_KTHP(double diem_KTHP) {
        this.diem_KTHP = diem_KTHP;
    }

    public void setTiet_nghi(int tiet_nghi) {
        this.tiet_nghi = tiet_nghi;
    }
    public String toString(){
        return "Ten: " + name + ", Tuoi: " + getTuoi() + ", GPA: " + getGPA() + ", So tiet nghi: "+ tiet_nghi;
    }
}
