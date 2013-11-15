/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

//We define what a Node is. If we want to use hashing the array will 
//need to have Nodes so it can deal with collisions
public class Node {
    public int value;
    public Node NextChild;
    
    //Default Constructor for the nodes
    public Node(int InElement){
        value = InElement;
        NextChild = null;
        
    }
}
