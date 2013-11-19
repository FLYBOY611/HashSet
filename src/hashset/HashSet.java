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
        ListOfSets masterlist = new ListOfSets();

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

        //Add those new sets into the master list
        masterlist.listofsets.add(Array1);
        masterlist.listofsets.add(Array2);

        //Ready the input fields!
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        int selector = 0;

        //This is the perfect kind of program for a switch statement!!!!

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
                        System.out.println("Add to which set?");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();

                        //If the masterlist has a set in that location
                        //add the element
                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true) {
                            set Foo = masterlist.listofsets.get(ArrayPick);
                            Operations.Insert(ElementIn, Foo);
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
                        System.out.println("Print which set?");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();

                        //If that set they want to choose does exist
                        //Print it out
                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true) {
                            set Foo = masterlist.listofsets.get(ArrayPick);
                            Operations.SetPrint(Foo);
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
                        System.out.println("Which set?");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();

                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true) {
                            set Foo = masterlist.listofsets.get(ArrayPick);
                            Operations.SetLength(Foo);
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
                        System.out.println("In which set?");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();

                        //If they choose a valid set
                        //check and see if it contains that element
                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true) {
                            set Foo = masterlist.listofsets.get(ArrayPick);
                            Operations.ElementOf(ElementIn2, Foo);
                            ValidChoice4 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "\r");
                        }
                    }
                    break;
                //CHECK IF BOTH SETS ARE EQUAL
                case 5:
                    boolean ValidChoice5 = false;

                    //Chose the array and make sure it's a valid choice
                    while (ValidChoice5 == false) {
                        System.out.println("Pick the first set to compare");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();
                        System.out.println("Pick the second set to compare");
                        int ArrayPick2 = input3.nextInt();


                        //If they choose a valid set
                        //check and see if it contains that element
                        //WE NEED ERROR CHECKING HERE TO VERIFY
                        //BOTH SETS EXIST IN OUR ARRAY OF ARRAYS
                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true
                                && masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick2)) == true) {
                            set Foo1 = masterlist.listofsets.get(ArrayPick);
                            set Foo2 = masterlist.listofsets.get(ArrayPick2);
                            //Send it to the equality method
                            Operations.Equality(Foo1, Foo2);
                            ValidChoice5 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "\r");
                        }
                    }
                    break;
                //CHECK IF ONE IS A SUBET OF THE OTHER
                case 6:
                    boolean ValidChoice6 = false;
                    
                    while (ValidChoice6 == false) {
                        System.out.println("Pick the 'Subset'");
                        masterlist.PrintList();
                        int ArrayPick = input3.nextInt();
                        System.out.println("Pick the 'Superset' you will "
                                + "check against.");
                        masterlist.PrintList();
                        int ArrayPick2 = input3.nextInt();

                        if (masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick)) == true
                                && masterlist.listofsets.contains(
                                masterlist.listofsets.get(ArrayPick2)) == true) {
                            set Foo1 = masterlist.listofsets.get(ArrayPick);
                            set Foo2 = masterlist.listofsets.get(ArrayPick2);
                            
                            //Send it to the subset method
                            Operations.isSubset(Foo1, Foo2);
                            ValidChoice6 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");
                        }
                    }
                    break;
                //COMBINE SETS IN A UNION
                case 7:
                    Operations.Union(Array1, Array2);
                    break;
                //DISPLAY DATA INTERSECTIONS
                case 8:
                    Operations.Intersection(Array1, Array2);
                    break;
                //DISPLAY DATA DIFFERENCES
                case 9:
                    Operations.Difference(Array1, Array2);
                    break;
                //DEEP COPY
                case 10:
                    boolean ValidChoice10 = false;

                    while (ValidChoice10 == false) {
                        menus.WhichArrayDeepCopy();
                        int ArrayPick = input3.nextInt();

                        if (ArrayPick == 1) {
                            Array2.stuff.clear();
                            Array2 =
                                    Operations.DeepCopy(Array1, Array2, ArrayPick);
                            ValidChoice10 = true;
                        } else if (ArrayPick == 2) {
                            Array1.stuff.clear();
                            Array1 =
                                    Operations.DeepCopy(Array1, Array2, ArrayPick);
                            ValidChoice10 = true;
                        } else {
                            System.out.println("That wasn't a valid choice!"
                                    + "/r");

                        }
                    }
                    break;
                //WIPE AWAY A SET
                case 11:
                    boolean ValidChoice11 = false;
                    while (ValidChoice11 == false) {
                        menus.WhichArrayWipe();
                        int ArrayPick = input3.nextInt();

                        if (ArrayPick == 1) {
                            Array1.stuff.clear();
                            ValidChoice11 = true;
                        } else if (ArrayPick == 2) {
                            Array2.stuff.clear();
                            ValidChoice11 = true;
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


    }
}
