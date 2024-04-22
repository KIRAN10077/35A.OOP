import java.util.Scanner;

public class another {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        sc.close();
        if (a > 18) {
            System.out.println(a + "is greater than 18");
        } else if (a == 10) {
            System.out.println(a + "is equal to ");
        } else {
            System.out.println("thank you");
  }

}
}
