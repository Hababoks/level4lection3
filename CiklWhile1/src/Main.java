import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number>0){
            sum = sum+number;
            number--;
        }
        System.out.println(sum);
        System.out.println(sum);
    }
}