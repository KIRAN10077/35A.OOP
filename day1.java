import java.util.Scanner;

public class day1 {
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Subject 1:\t");
        int sub1 = scan1.nextInt();
        
        System.out.println("Subject 2:\t");
        int sub2 = scan1.nextInt();

        System.out.println("Subject 2:\t");
        int sub3 = scan1.nextInt();

        System.out.println("Subject 4:\t");
        int sub4 = scan1.nextInt();

        System.out.println("Subject 5:\t");
        int sub5 = scan1.nextInt();


        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500.0f) * 100; // Corrected calculation
        System.out.printf("The percentage you got is: %.2f %%", percentage); // Corrected printf statement

        scan1.close();



    }
    
}
