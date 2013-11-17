package hashset;

//Here we will implement all our methods that we declared in the ADT
public class ArrayMethods implements HashADT {

    //Checks to see if both sets are equal
    //This totally looks like it would work but does it 
    //account for collisions and links?
    public boolean Equality(set DataSetA, set DataSetB) {
        if (DataSetA.stuff.equals(DataSetB.stuff)) {
            System.out.println("These sets are totally equal!");
            return true;
        } else {
            System.out.println("These sets are not equal");
            return false;
        }

    }

    //Check to see if Set B is a subset of A
    //Seriously, we have a method in the API to do just that
    //Is it really this easy?
    public boolean isSubset(set DataSetA, set DataSetB) {
        if (DataSetA.stuff.containsAll(DataSetB.stuff)) {
            System.out.println("The set is a subset!");
            return true;
        } else {
            System.out.println("The set is not a subset!");
            return false;
        }
    }

    //Takes two sets and returns a new set that combines
    //all the elements of both
    //Something kinda tricky!
    public set Union(set DataSetA, set DataSetB) {
        //Make a new Data set and call it C
        set DataSetC = new set();

        //Cycle Through A and put everything in C
        for (int i = 0; i < DataSetA.stuff.size(); i++) {
            int item = DataSetA.stuff.get(i);

            if (DataSetC.stuff.contains(item) == false) {
                DataSetC.stuff.add(item);
            }
        }

        //Cycle through set B, if the item is not
        //contained within set C have it added
        //Otherwise it gets passed over
        for (int i = 0; i < DataSetB.stuff.size(); i++) {
            int item = DataSetB.stuff.get(i);

            if (DataSetC.stuff.contains(item) == false) {
                DataSetC.stuff.add(item);
            }
        }

        //Print out the combined set you just made
        System.out.println("\rThe combined elements are:");
        for (int i = 0; i < DataSetC.stuff.size(); i++) {
            int item = DataSetC.stuff.get(i);
            System.out.print(item + " ");

        }
        System.out.print("\r");

        return DataSetC;
    }

    //Given two sets return a set that contains
    //all the elements contained within set A and B
    public set Intersection(set FirstSet, set SecondSet) {
        //Make a new set
        set ThirdSet = new set();

        //Cycle through the first array and compare to the second
        //to see what's in the first and the second
        //add those elements to the third array
        for (int i = 0; i < FirstSet.stuff.size(); i++) {
            int item = FirstSet.stuff.get(i);
            if (SecondSet.stuff.contains(item) == true) {
                ThirdSet.stuff.add(item);
            }
        }

        //Print out the combined set you just made
        System.out.println("\rThe intersecting elements are:");
        for (int i = 0; i < ThirdSet.stuff.size(); i++) {
            int item = ThirdSet.stuff.get(i);
            System.out.print(item + " ");

        }
        System.out.print("\r");

        return ThirdSet;
    }

    //Given two sets return a set that contains 
    //all elements that are not shared between A and B
    public set Difference(set FirstSet, set SecondSet) {
        //Make a new set
        set ThirdSet = new set();

        //Cycle through the FIRST array and compare to the second
        //to see what's in the first and not the second
        //add those elements to the third array
        for (int i = 0; i < FirstSet.stuff.size(); i++) {
            int item = FirstSet.stuff.get(i);
            if (SecondSet.stuff.contains(item) == false) {
                ThirdSet.stuff.add(item);
            }
        }

        //Cycle through the SECOND array and compare to the first
        //to see what's in the second and not the first
        //add those elements to the third array
        for (int i = 0; i < SecondSet.stuff.size(); i++) {
            int item = SecondSet.stuff.get(i);
            if (FirstSet.stuff.contains(item) == false) {
                ThirdSet.stuff.add(item);
            }
        }

        //Print out the combined set you just made!
        System.out.println("\rThe different elements are:");
        for (int i = 0; i < ThirdSet.stuff.size(); i++) {
            int item = ThirdSet.stuff.get(i);
            System.out.print(item + " ");

        }
        System.out.print("\r");
        return ThirdSet;
    }

    //NOT OUR FINAL INSERTION METHOD
    //WE NEED TO DO THIS WITH HASHING
    public void Insert(int Element, set DataSet) {
        //If the set already contains that element then
        //it needs to be rejected
        if (DataSet.stuff.contains(Element) == true) {
            System.out.println("ERROR! "
                    + "Element " + Element + " is already contained "
                    + "in that set!");
        } else {
            System.out.println("Element " + Element + " has been inserted "
                    + "in that set");
            DataSet.stuff.add(Element);
        }
    }

    //Determines if the element exists within the set
    //Again, this is suspiciously easy >_>
    public boolean ElementOf(int Element, set DataSet) {
        boolean YesOrNo = false;
        if (DataSet.stuff.contains(Element)) {
            System.out.println("That element exists in that set!");
            return true;
        } else {
            System.out.println("That element does not exist in that set");
            return false;
        }
    }

    //Returns the set as a String to be printed
    public String ToString(set DataSet) {
        String TheString = "";
        for (int i = 0; i < DataSet.stuff.size(); i++) {
            TheString += DataSet.stuff.get(i) + " ";

        }
        return TheString;
    }

    //Completely copies one set onto another 
    //I'M UNSURE THIS WORKS
    public set DeepCopy(set FirstSet, set SecondSet, int choice) {
        if (choice == 1) {
            for (int i = 0; i < SecondSet.stuff.size(); i++) {
                int item = SecondSet.stuff.get(i);
                FirstSet.stuff.add(item);
            }
            return FirstSet;
        } else if (choice == 2) {
            for (int i = 0; i < FirstSet.stuff.size(); i++) {
                int item = FirstSet.stuff.get(i);
                SecondSet.stuff.add(item);
            }
            return SecondSet;
        }
        //Can I geet rid of this one?
        return FirstSet;
    }

    //Prints out all data elements in the set
    public void SetPrint(set DataSet) {
        System.out.println("\rThe current elements are:");

        for (int i = 0; i < DataSet.stuff.size(); i++) {
            int item = DataSet.stuff.get(i);
            System.out.print(item + " ");
        }
        System.out.print("\r");
    }

    //Returns the length of the Set that it's given
    public int SetLength(set DataSet) {
        System.out.println("The set is of length " + DataSet.stuff.size());
        return DataSet.stuff.size();
    }
}
//SCRAP CODE
//For every element of B, run it
//through our Insertion method to add it
//But how do I call the Insert method without
//first creating a new instance of my ArrayMethods class?
//it doesn't seem to want to let me call the Insert method....
        /*
 for (int i = 0; i < DataSetB.stuff.size(); i++){ 
            
 DataSetC.stuff.Insert(DataSetB.stuff.get(i), DataSetC);       
            
 } */
//ELEMENT OF CODE
        /*
         for (int i = 0; i < DataSet.stuff.size(); i++){           
         if(i == Element)       
         YesOrNo = true;
         break;
         }
         return YesOrNo; */