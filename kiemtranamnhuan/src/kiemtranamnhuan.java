import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap nam");
        int nam;
        nam=scanner.nextInt();
        if ((nam%4==0 && nam%100!=0) || (nam%400==0) ){
            System.out.println(" La nam nhuan ");
        }else {
            System.out.println("nam khong nhuan");
        }
    }
}
