package Warmup;

public class Staircase {
    public static void main(String[] args) {
        int n = 28;

        int star = 1, space = n - 1;
        if (n <= 25) {
            while (n > 0) {
                for (int i = 0; i < space; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < star; i++) {
                    System.out.print("#");
                }
                star = star + 1;
                space = space - 1;
                --n;
                System.out.println("");
            }
        } else {
            while (n > 0) {
                for (int i = 0; i < space; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < star; i++) {
                    System.out.print("#");
                }
                star = star + 1;
                space = space - 1;
                --n;
                System.out.println("");
            }
        }
    }
}
