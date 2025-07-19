import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong cua so 5 la:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5x" + i + "=" + (5 * i));
        }
        int tong = 0;
        int j = 0;
        while (j <= 99) {
            j++;
            if (j % 2 == 0) {
                tong += j;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100 la: " + tong);
        sc.close();
    }
}