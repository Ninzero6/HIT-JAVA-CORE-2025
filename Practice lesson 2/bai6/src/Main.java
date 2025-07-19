import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("Nhap so luong sinh vien: ");
         int n=sc.nextInt();
         sc.nextLine();
         String[] name= new String[n];
         int[] age= new int[n];
         double[] gpa= new double[n];
         double tongdiem =0;
         double diemmax =0;
         int vtmax =0;
         for(int i=0;i<n;i++){
             System.out.println("Nhap thong tin sinh vien thu "+(i+1)+":");
             System.out.print("Ten: ");
             name[i]= sc.nextLine();
             System.out.print("Tuoi: ");
             age[i]= sc.nextInt();
             System.out.print("DiemTB: ");
             gpa[i]=sc.nextDouble();
             sc.nextLine();
             tongdiem+= gpa[i];
             if(gpa[i]>diemmax){
                 diemmax=gpa[i];
                 vtmax= i;
             }
         }
         System.out.println("Danh sach sinh vien");
         for(int i=0;i<n;i++){
             System.out.println("Ten: "+name[i]+", Tuoi: "+age[i]+", DiemTb: "+gpa[i]);

         }
         double diemTBC= tongdiem/n;
         System.out.println("Diem tb ca lop: "+ diemTBC);
         System.out.println("Sinh vien co diem cao nhat: ");
         System.out.println("Ten: "+name[vtmax]+", Tuoi: "+ age[vtmax]+", DiemTb: "+diemmax);
         sc.close();
     }
 }