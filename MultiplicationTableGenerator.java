import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting point: ");
        int n = sc.nextInt();//enter starting number of table
        System.out.println("enter ending point: ");
        int e = sc.nextInt(); //enter ending number of table
        System.out.println("enter m: ");
        int m = sc.nextInt(); //enter multiplication limit number
        for (int j = n; j <= e; j++) {
            System.out.println("table of " + j);
            for (int i = 1; i <= m; i++) {
                System.out.println(j + " * " + i + "= " + j * i);
            }
            System.out.println("Multiplication table completed");
        }
    }
}
