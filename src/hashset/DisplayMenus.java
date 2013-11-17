/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

/**
 *
 * @author Richard
 */
public class DisplayMenus {
    
    void MainMenu(){
        System.out.println("1. Add an element to a set");
        System.out.println("2. Check the contents of a set");
        System.out.println("3. Check the length of a set");
        System.out.println("4. See if an element is contined in a set");
        System.out.println("5. Check if both sets are equal");
        System.out.println("6. Check if one set is a subset of the other");
        System.out.println("7. Combine the sets in a Union");
        System.out.println("8. See the data intersections");
        System.out.println("9. Display the elements that are different");
        System.out.println("10. Deep copy one set to another");
        System.out.println("12. Exit the program");
    }
    
    void WhichArray(){
        System.out.println("Which set do you want to use?");
        System.out.println("1. Set #1");
        System.out.println("2. Set #2");
    }
}
