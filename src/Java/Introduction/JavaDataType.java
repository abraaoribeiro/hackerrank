package Java.Introduction;

import java.util.Scanner;

public class JavaDataType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            allowedValue(sc);
        }
    }

    private static void allowedValue (Scanner sc) {
        try {
            long x = sc.nextLong();
            String answer = "";

            System.out.println(x + " can be fitted in:");
            if (x <= Byte.MAX_VALUE && x >= Byte.MIN_VALUE) {
                answer = answer.concat("* byte\n* short\n* int\n* long");
                System.out.println(answer);
            } else if (x <= Short.MAX_VALUE && x >= Short.MIN_VALUE){
                answer = answer.concat("* short\n* int\n* long");
                System.out.println(answer);
            } else if (x <= Integer.MAX_VALUE && x >= Integer.MIN_VALUE) {
                answer = answer.concat("* int\n* long");
                System.out.println(answer);
            } else if (x <= Long.MAX_VALUE && x >= Long.MIN_VALUE){
                answer = "* long";
                System.out.println(answer);
            }

        } catch (Exception e) {
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }

}
