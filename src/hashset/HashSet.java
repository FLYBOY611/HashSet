/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

import java.util.Scanner;

public class HashSet {

    public static void main(String[] args) {

        System.out.println("Welcome to the friendly Hash Table program!");
        System.out.println("This program can do a variety of functions"
                + " using two different data sets");
        System.out.append("To get started, we have implemented two different"
                + " sets of data");
        //Pull instances of our classes
        ArrayMethods Operations = new ArrayMethods();
        DisplayMenus menus = new DisplayMenus();
        //Make two new sets
        set Array1 = new set();
        set Array2 = new set();

        //Fill those sets with some default values
        for (int i = 1; i < 6; i++) {
            //Operations.Insert(i, Array1);
            Array1.stuff.add(i);
        }

        for (int i = 3; i < 8; i++) {
            //Operations.Insert(i, Array2);
            Array2.stuff.add(i);
        }

        //Ready the input fields!
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        int selector = 0;


        while (selector != 12) {
            System.out.println("\rEnter the number of your next choice");
            menus.MainMenu();
            //Take their choice then do the operation
            selector = input1.nextInt();

            switch (selector) {
                //INSERT AN ELEMENT TO A SET
                case 1:
                    System.out.println("What element do you want to input?");
                    int ElementIn = input2.nextInt();
                    boolean ValidChoice = false;

                    //Chose the array and make sure it's a valid choice
                    while (ValidChoice == false) {
                        menus.WhichArray();
                        int ArrayPick = input3.nextInt();
                        if (ArrayPick == 1) {
                            Operations.Insert(ElementIn, Array1);
                            ValidChoice = true;
                        } else if (ArrayPick == 2) {
                            Operations.Insert(ElementIn, Array2);
                            ValidChoice = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");
                        }
                    }
                    break;
                //PRINT OUT A SET
                case 2:
                    boolean ValidChoice2 = false;
                    //Chose the array and make sure it's a valid choice
                    while (ValidChoice2 == false) {
                        menus.WhichArray();
                        int ArrayPick = input3.nextInt();
                        if (ArrayPick == 1) {
                            Operations.SetPrint(Array1);
                            ValidChoice2 = true;
                        } else if (ArrayPick == 2) {
                            Operations.SetPrint(Array2);
                            ValidChoice2 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");
                        }
                    }
                    break;
                //CHECK THE LENGTH OF A SET
                case 3:
                    boolean ValidChoice3 = false;
                    //Chose the array and make sure it's a valid choice
                    while (ValidChoice3 == false) {
                        menus.WhichArray();
                        int ArrayPick = input3.nextInt();
                        if (ArrayPick == 1) {
                            Operations.SetLength(Array1);
                            ValidChoice3 = true;
                        } else if (ArrayPick == 2) {
                            Operations.SetLength(Array2);
                            ValidChoice3 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");
                        }
                    }
                    break;
                //ELEMENT IS CONTAINED IN A SET
                case 4:
                    System.out.println("What element do you want"
                            + " to check for?");
                    int ElementIn2 = input2.nextInt();
                    boolean ValidChoice4 = false;

                    //Chose the array and make sure it's a valid choice
                    while (ValidChoice4 == false) {
                        menus.WhichArray();
                        int ArrayPick = input3.nextInt();
                        if (ArrayPick == 1) {
                            Operations.ElementOf(ElementIn2, Array1);
                            ValidChoice4 = true;
                        } else if (ArrayPick == 2) {
                            Operations.ElementOf(ElementIn2, Array2);
                            ValidChoice4 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");
                        }
                    }
                    break;
                case 12:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("That wasn't a selection!!!!!");
                    break;
            }
        }

        Operations.SetPrint(Array1);

        Operations.Insert(3, Array1);
        //Operations.SetLength(Array1);
        //This looks like the perfect kind of program for a Switch statement!

    }
}
