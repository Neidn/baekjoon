import java.util.Scanner;

public class q1712 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if (C <= B) System.out.println(-1);
        else System.out.println(A / (C - B) + 1);
    }
}