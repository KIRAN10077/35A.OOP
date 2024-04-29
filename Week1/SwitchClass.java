public class SwitchClass {
    public static void main(String[] args){
        char charValue = 'b';
        int intValue =10;
        switch (charValue) {
            case 'a':
                System.out.println("Apple");
                break;

            case 'b':
              switch(intValue){
                case 10:
                    System.out.println("Ten");
                    break;
                case 20:
                    System.out.println("Twenty");
                    break;
              }
                System.out.println("ball");
                break;

            case 'c':
                System.out.println("cat");
                break;

            case 'd':
                System.out.println("dog");
                break;
        
            default:
                System.out.println("No word found");
                break;
        }
        /*Task
         * Switch case:
         * 0- sunday
         * 1- monday
         * 2- tuesday
         * 3- wednesday
         * 4- thhursday
         * 5- friday
         * 6- saturday
         * other - invalid day
         * int day=2;
         */

        int day = 2;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
            System.out.println("INVALID INPUT");
                break;
        }

    }
    
}