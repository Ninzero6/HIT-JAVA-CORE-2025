import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int tong =0;
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
            tong+=a[i];
        }
        System.out.println();
        System.out.println("Tong cac phan tu trong mang la: "+tong);
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        System.out.println("So lon nhat trong mang la: "+max);

        sc.close();
    }
}