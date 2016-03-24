/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.view;

/**
 *
 * @author Ni shi shei
 */
public class GetNumberView extends View {
    
    public GetNumberView() {
        super ("\n Enter your age");
    }
    
      
    
    

    @Override
    public boolean doAction(String value) {
        Double number = null;
        //Convert to a number
        
        //make sure it's not less that 0, display error and return false
        //make sure it's not greater than 100, display error and return false
        
        //display input
        
        
        while (number == null) {
            value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
            //parse and convert number from text to a double
            number = Double.parseDouble(value);
        }
        
        return ;

    }
    }

