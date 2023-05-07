import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int toplam = 1;
        

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        x=scanner.nextInt();
        System.out.println("Lütfen üs giriniz");
        y=scanner.nextInt();
        
        for(int i=1;i<=y;i++){
            toplam*=x;
            }
        System.out.println(toplam);
    }
}