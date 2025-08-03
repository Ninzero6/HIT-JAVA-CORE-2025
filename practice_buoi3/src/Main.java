import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Trung", 2006, "Phu Tho", 7.5, 8.0, 9.0, 2);
        students[1] = new Student("Thinh", 2006, "Bac Ninh", 6.0, 7.0, 8.5, 3);
        students[2] = new Student("Nga", 2006, "Phu Tho", 9.0, 9.5, 10.0, 1);
        students[3] = new Student("Uyen", 2006, "Phu Tho", 8.0, 7.5, 9.0, 0);
        students[4] = new Student("Huy", 2006, "Nghe An", 5.5, 6.0, 7.0, 4);

        System.out.printf("%-10s%-8s%-12s%-12s%-12s%-14s%-10s%-12s\n", "Ten", "Tuoi", "Dia chi", "Diem tx1", "Diem tx2", "Diem KTHP", "GPA", "So tiet nghi");

        for (Student s : students) {
            System.out.printf("%-10s%-8d%-12s%-12.1f%-12.1f%-14.1f%-10.2f%-12d\n", s.getName(), s.getTuoi(), s.getAddress(), s.getDiem_tx1(), s.getDiem_tx2(), s.getDiem_KTHP(), s.getGPA(), s.getTiet_nghi());
        }
        System.out.println("------ Quan ly sinh vien ------");
        System.out.println("Hay chon chuc nang:");
        System.out.println("1. Them sinh vien moi");
        System.out.println("2. Sua thong tin sin vien");
        System.out.println("3. Sap xep sinh vien theo tuoi");
        System.out.println("4. Sap xep sinh vien theo GPA");
        System.out.println("5. Sap xep sinh vien theo so tiet nghi");
        System.out.println("6. Xoa sinh vien khoi danh sach");
    }
}