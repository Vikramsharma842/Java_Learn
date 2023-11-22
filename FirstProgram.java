import java.util.Scanner;

class FirstProgram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number*4);
        sc.close();

    }
}