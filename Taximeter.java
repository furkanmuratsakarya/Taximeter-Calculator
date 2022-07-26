import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){
        int km;
        double fee;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance traveled in km: ");
        km = sc.nextInt();
        fee = 10 + (km*2.2);
        fee = fee<=20 ? 20 : fee;

        System.out.println("--------------------------------");
        System.out.println("Total fee: " +fee +"TL");
        System.out.println("--------------------------------");
    }
}