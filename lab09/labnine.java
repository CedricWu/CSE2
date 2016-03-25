// Yuxin WU, Mar. 25th
// lab 9, random number, methods to generate sentence

import java.util.Random; //import a random number


public class labnine{
        public static String adj () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(10); //store the random number
            String adj = "";
           
            
            switch (randomInt) {
                case 0:
                    adj="good";
                    break;
                case 1:
                    adj="nice";
                    break;
                case 2:
                    adj="cool";
                    break;
                case 3:
                    adj="beautiful";
                    break;
                case 4:
                    adj="wonderful";
                    break;
                case 5:
                    adj="common";break;
                case 6:
                    adj="different";break;
                case 7:
                    adj="same";break;
                case 8:
                    adj="crazy";break;
                case 9:
                    adj="orange";break;
                    
            }
            
            return adj;
        }
        
        public static String subj () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(10); //store the random number
            String subj="";
            
            switch (randomInt) {
                case 0:
                    subj="dog";break;
                case 1:
                    subj="cat";break;
                case 2:
                    subj="spider";break;
                case 3:
                    subj="bat";break;
                case 4:
                    subj="hat";break;
                case 5:
                    subj="bird";break;
                case 6:
                    subj="cloud";break;
                case 7:
                    subj="wind";break;
                case 8:
                    subj="fish";break;
                case 9:
                    subj="pig";break;
                    
            }
            return subj;
        }
        
        public static String verb () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(10); //store the random number
            String verb="";
            switch (randomInt) {
                case 0:
                    verb="walked";break;
                case 1:
                    verb="talked";break;
                case 2:
                    verb="told";break;
                case 3:
                    verb="smiled";break;
                case 4:
                    verb="ran";break;
                case 5:
                    verb="spoke";break;
                case 6:
                    verb="took";break;
                case 7:
                    verb="made";break;
                case 8:
                    verb="nailed";break;
                case 9:
                    verb="organized";
                    break;
            }
            return verb;
        }
        
        public static String obj () {
            Random randomGenerator = new Random(); // generate the random number
            int randomInt = randomGenerator.nextInt(10); //store the random number
            String obj="";
            switch (randomInt) {
                case 0:
                    obj="table";break;
                case 1:
                    obj="chair";break;
                case 2:
                    obj="mouse";break;
                case 3:
                    obj="screen";break;
                case 4:
                    obj="window";break;
                case 5:
                    obj="door";break;
                case 6:
                    obj="string";break;
                case 7:
                    obj="wire";break;
                case 8:
                    obj="desk";break;
                case 9:
                    obj="drawer";break;
                  
                  
            }
            
            return obj;
        }
        
        
        
        
        public static void main(String[] args) {
           String subject = subj ();
           String object = obj ();
           String verbverb= verb ();
           String adjective=adj ();
           
            
          
          int i=1;
          while(i<9){
              i++;
              
              System.out.print("The " + " " + adjective + " " + adjective + " "+ subject + " " +verbverb + " the " + adjective + " " + object +".");
              System.out.println("");
          }
            
    }
    
    
}