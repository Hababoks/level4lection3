import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int sum = 0;
        boolean isBool = false;
        while (!isBool && scr.hasNextInt()) {
            int val = scr.nextInt();
            sum += val;
            if (scr.hasNextLine()) {
                String s = scr.nextLine();
                isBool = s.equals("ENTER");
            }
        }
        System.out.println(sum);

    }
}