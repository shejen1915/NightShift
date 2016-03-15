/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import static byui.cit260.nightShift.control.InventorySort.sortString;
import java.util.Arrays;

/**
 *
 * @author Silver
 */
public class QuestCompleted {
    

    //shorting epic quest
    public static String sortString(String s) {
        char[] tempArray = s.toCharArray(); //we copy our string to the char array
        Arrays.sort(tempArray); //sorting the quest
        String sorted = new String(tempArray); // strings are created
        //and there you have it
        
        return sorted;
    }
        public static void Scenes (String[] args) {
        String s1 = "GetDown";
        String s2 = "KeyBase";
        String s3 = "SecretRoom";
        String s4 = "GhostBusters";
        String s5 = "TheGrudge";
        String s6 = "ClockOut!";
        
        System.out.println(sortString(s1));
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
        System.out.println(sortString(s4));
        System.out.println(sortString(s5));
        System.out.println(sortString(s6));

    }

    public void display() {
        System.out.println("\n you just called the QuestCompleted function");
    }
}
