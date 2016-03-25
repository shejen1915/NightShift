/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

import java.io.PrintWriter;
import nightshift.NightShift;

/**
 *
 * @author Silver
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = NightShift.getOutFile();
    private static final PrintWriter logFile = NightShift.getLogFile();
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                    "-------------------------------------------------"
                  + "\n- ERROR -" + errorMessage
                  + "\n------------------------------------------------");
        //log error
        logFile.print(className + "-" + errorMessage);
    }
    
    }
