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
        System.out.println("11. Completely wipe a set");
        System.out.println("12. Exit the program");
    }
    
    void WhichArray(){
        System.out.println("Which set do you want to use?");
        System.out.println("1. Set #1");
        System.out.println("2. Set #2");
    }
    
    void WhichArrayWipe(){
        System.out.println("Which set do you want to wipe?");
        System.out.println("1. Set #1");
        System.out.println("2. Set #2");
    }
    
    void WhichArraySubset(){
        System.out.println("Which subset do you want to check?");
        System.out.println("1. Is Set #2 a subset of Set #1");
        System.out.println("2. Is Set #1 a subset of Set #2");
    }
    
    void WhichArrayDeepCopy(){
        System.out.println("Which subset do you want to copy?");
        System.out.println("1. Copy Set #1 onto Set #2");
        System.out.println("2. Copy Set #2 onto Set #1");
    }
}
