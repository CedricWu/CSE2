// Yuxin Wu (Cedric), Mar 4th '16
// homework 6, print a spinner


public class TextSpinner{
                // main method required for every Java program
               public static void main(String[] args) {
       
       int a =1;
       
        while(a>0){
            int b = a % 4;
            if (b==0){
                System.out.print("\b" + "/");
            }
            
            if (b==1){
                System.out.print("\b" + "-");
            }
            if (b==0){
                System.out.print("\b" + "\\");
            }
            if (b==0){
                System.out.print("\b" + "|");
            }
            
            
            a++;
            
            
        }
        
               }}
               