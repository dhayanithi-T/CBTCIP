package pro;

import java.util.*;
import javax.swing.*;

public class guessnum{
 public static void main (String args[]){
     Random random= new Random();
     int randomnum =random.nextInt(100)+1;

    int maxattempt= 10;
    int attemps=0;
    while (attemps<maxattempt){
        String gs= JOptionPane.showInputDialog(null, "Guess N30umber (between 1 to 100 :");
        int guess = Integer.parseInt(gs);
         if (guess==randomnum){
            JOptionPane.showMessageDialog(null, "You guess the number ");
            break;

         }
         else  if(guess<randomnum){
            JOptionPane.showMessageDialog(null,"Try a higher number ");
         }
         else {
            JOptionPane.showMessageDialog(null,"Try a lower number ");
         }
          attemps++;
    }

    if (attemps == maxattempt){
        JOptionPane.showMessageDialog(null,"No more attempts you have. The number was"+randomnum+".");
    }
 }
}