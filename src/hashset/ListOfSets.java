/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

import java.util.ArrayList;

//We're going to have an ArrayList of "sets"
//It's ArrayLists within an ArrayList
public class ListOfSets {
    ArrayList<set> listofsets = new ArrayList<set>();
    
    //We can use this when we need to print out our current list of sets
    void PrintList(){
        for (int i = 0; i < listofsets.size(); i++) {
            System.out.println(i + "." + " Set " + i );
        }
        System.out.print("\r");
    }
}
