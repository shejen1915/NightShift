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
    }
    
    public Double getNumber() {
        
        super("\n Enter a number");
        }

        
    
    
        Double number = null;
        
        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
            //parse and convert number from text to a double
            number = Double.parseDouble(value);
        }
        
        return number;
    }
}
