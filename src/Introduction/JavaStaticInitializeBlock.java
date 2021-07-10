package Introduction;

import java.util.Scanner;

public class JavaStaticInitializeBlock {

    public static void main(String[] args) {
        Foo foo = new Foo();
    }

}

class Foo{
    static int B,H;
    static boolean flag = true;

    static {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int B = input.nextInt();
        int H = input.nextInt();
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
            System.out.println(B*H);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}