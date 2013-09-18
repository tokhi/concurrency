package thread.timer;
//displays characters in separate threads
import java.util.*;
public class DisplayCharSequence extends TimerTask {
   private char displayChar;
   Timer timer;
   
   //constructor for character displayer
   public DisplayCharSequence(char c){
      displayChar = c;
      timer = new Timer();
      timer.schedule(this, 0);
   }

   //display the occurrences of the character
   public void run() {
       for (int i = 0; i < 10; ++i) {
           System.out.print(displayChar);
       }
       timer.cancel();
   }

   //main
public static void main (String[] args) {
	  DisplayCharSequence s1 = new DisplayCharSequence('M');
      DisplayCharSequence s2 = new DisplayCharSequence('A');
      DisplayCharSequence s3 = new DisplayCharSequence('R');
      DisplayCharSequence s4 = new DisplayCharSequence('K');
   }
}