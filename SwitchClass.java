public class SwitchClass {
    public static void main(String[] args){
        char charValue = 'b';
        int intValue =10;
        switch (charValue) {
            case 'a':
                System.out.println("Apple");
                break;

            case 'b':
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
    }
    
}