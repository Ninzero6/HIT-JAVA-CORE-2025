import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        String tuoi = sc.nextLine();
        System.out.println("Chieu cao: ");
        String chieucao = sc.nextLine();
        System.out.println("Xin chao " + ten + ", ban " + tuoi + " tuoi va cao " + chieucao + " met");
        System.out.println("Ban hoc lop: ");
        String lop = sc.nextLine();
        System.out.println("Gpa cua ban: ");
        String gpa = sc.nextLine();
        System.out.println("Ten: " + ten + " - Tuoi: " + tuoi + " - Lop: " + lop + " - Gpa: " + gpa);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nhap so nguyen a: ");
            int a = sc.nextInt();
            System.out.println("Nhap so nguyen b: ");
            int b = sc.nextInt();
            int tong = a + b;
            int hieu = a - b;
            int tich = a * b;
            System.out.println("Tong 2 so la: "+ tong);
            System.out.println("Hieu 2 so la: "+ hieu);
            System.out.println("Tich 2 so la: "+ tich);
            if(b!=0) {
                double thuong = (double) a / b;
                double laydu = a % b;
                System.out.println("Thuong 2 so do la:"+thuong);
                System.out.println("Chia lay du la:"+laydu);
            }
            else{
                System.out.println("Khong the chia hoac chia lay du cho 0");
            }
            if(a==b){
                System.out.println("Hai so a va b bang nhau");
            }
            else{
                System.out.println("Hai so a va b khong bang nhau");
            }


        }
    }
}

