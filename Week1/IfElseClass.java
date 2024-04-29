public class IfElseClass {
    public static void main (String[]args){
        /*if statement */
        if(true){
            System.out.println("true statement");

        }
        // the parathesis takes a boolean expression
        int num1=10 , num2=20;
        if (num1==num2){
            System.out.println("Equal");

        }else{
            System.out.println("Not equal");

        // if else if

        if (num1==num2){
            System.out.println("equal");

        }else if (num1<num2){
            System.out.println("greater");


        }else if (num1!=num2){
            System.out.println("not equal");

        }else if (num1>0){
            System.out.println("positive");

        }else{
            System.out.println("default statement ");
        }


        
            
        }
    }//note that the else statement is always optional
    
}
