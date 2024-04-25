public class JavaArgument {
    public static void main(String[] args){
        if (args.length<2){
            System.out.println("Provide args:");
            return;

        }
        System.out.println("Firstargs:\t"+args[0]);
        System.out.println("secondargs:\t"+args[1]);
        /*Make sure 2nd args is num */
        int parsedValue = Integer.parseInt(args[1]);
        System.out.println("Parsed value:\t" + parsedValue);
    }
    
}
