// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            word = word.toUpperCase();
            int num = Integer.parseInt(args[1]);
            int length = word.length();
            int at = 0;
            String AN = "AEFHILMNORSX";
                
            while (length>0) {
                if (AN.indexOf(word.charAt(at))==-1) {
                System.out.println("Give me a "+(word.charAt(at))+": "+(word.charAt(at))+"!");
                }

                else{
                System.out.println("Give me an "+(word.charAt(at))+": "+(word.charAt(at))+"!");
                }
                at++;
                length = length-1;
            }

                 System.out.println("What does that spell?");
                 
                 while (num>0) {
                   System.out.println(word+"!!!");
                   num = num-1;
            }

        }
}
