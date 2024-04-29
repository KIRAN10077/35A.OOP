import java.util.Scanner;

public class day1 {
    public static void main(String[] args){
        // Scanner scan1 = new Scanner(System.in);

        // System.out.println("Subject 1:\t");
        // int sub1 = scan1.nextInt();
        
        // System.out.println("Subject 2:\t");
        // int sub2 = scan1.nextInt();

        // System.out.println("Subject 2:\t");
        // int sub3 = scan1.nextInt();

        // System.out.println("Subject 4:\t");
        // int sub4 = scan1.nextInt();

        // System.out.println("Subject 5:\t");
        // int sub5 = scan1.nextInt();


        // float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500.0f) * 100; 
        // System.out.printf("The percentage you got is: %.2f %%", percentage); 
        // scan1.close();

        /*TASK:
         * take marks of 3 subjects and calculate and print average.
         */
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Marks of 1st subject: ");
        // int sub1 = sc.nextInt();

        // System.out.println("Marks of 2nd subject: ");
        // int sub2 = sc.nextInt();

        // System.out.println("Marks of 3rd subject: ");
        // int sub3 = sc.nextInt();

        // float average = (sub1+sub2+sub3)/3;
        // System.out.printf("The average is:\t%f",average);

        Scanner sc = new Scanner(System.in);

        System.out.print("Distance in kilometres:\n");
        float km = sc.nextFloat();

        double mile = km * 0.62;
        System.out.printf("%f km is equal to %.2f miles",km, mile);

    }
    
}



