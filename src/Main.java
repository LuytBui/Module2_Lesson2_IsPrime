import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int number = sc.nextInt();
        String message = String.format("%d ", number);
        message += isPrime(number)? "là số nguyên tố." : "không phải số nguyên tố.";
        System.out.println(message);

//        for (int i = 0; i< 20; i++){
//            System.out.printf("%d %b\n", i, isPrime(i));
//        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
}
