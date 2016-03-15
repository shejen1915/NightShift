/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

import java.util.Arrays;


/**
 *
 * @author Ni shi shei
 */
public class InventorySort {

    //lets write our function here
    public static String sortString(String s) {
        char[] tempArray = s.toCharArray(); //we copy our string to the char array
        Arrays.sort(tempArray); //then we sort this array using built-in functions
        String sorted = new String(tempArray); // now we create new string
        //from that sorted array
        
        return sorted;
    }
    
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "charm";
        String s3 = "special item";
        String s4 = "attack Item";
        
        System.out.println(sortString(s1));
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
        System.out.println(sortString(s4));

    }
}
