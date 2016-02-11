/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.nightShift.control;

/**
 *
 * @author Ni shi shei
 */
public class GoOutWindowControl {
    public double calcRopeLength(double length){

        /** does this render the entire equation obsolete?
	if (length < 12.5) {
	return -1;
        }

	if (length > 17.5) {
	return -1;
        }
        */
        
        /*compare length to equation*/
                /*declare variables*/
        double roomHeight = 12;
        double ceilingToWindow = 2;
        double floorToWindow = 4;
        double pillarCircumference = 2;
        double pillarToWindow = 4;
        
            /*declare functions*/
        double windowHeight = (roomHeight - ceilingToWindow - floorToWindow);
		/*calcWindowHeight = (roomHeight - distanceFromCeilingToWindow - distanceFromFloorToWindow)*/

        double windowToWindow = (ceilingToWindow + floorToWindow);
		/*calcDistanceBetweenWindows = (distanceFromCeilingToWindow + distanceFromFloorToWindow)*/

        double minRopeLength = (pillarCircumference + pillarToWindow + windowToWindow + .5);
		/*minRopeLength = (pillarCircumference + distanceFromPillarToWindow + distanceBetweenWindows + .5 ft)*/

                
        double maxRopeLength = (minRopeLength + 5);
		/*maxRopeLength = (minRopeLength + 5 ft)*/

                /*if statement revised*/
        if (length < minRopeLength || length > maxRopeLength){
            return -1;
        } else {
            return length;
        }
	
    }

}
