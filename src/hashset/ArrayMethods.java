package hashset;

//Here we will implement all our methods that we declared in the ADT
public class ArrayMethods implements HashADT {

    //Checks to see if both sets are equal
    //This totally looks like it would work but does it 
    //account for collisions and links?
    public boolean Equality(set DataSetA, set DataSetB) {
        if (DataSetA.stuff.equals(DataSetB.stuff)) {
            return true;
        } else {
            return false;
        }

    }

    //Check to see if Set B is a subset of A
    //Seriously, we have a method in the API to do just that
    //Is it really this easy?
    public boolean isSubset(set DataSetA, set DataSetB) {
        if (DataSetA.stuff.containsAll(DataSetB.stuff)) {
            return true;
        } else {
            return false;
        }
    }

    //Takes two sets and returns a new set that combines
    //all the elements of both
    //Something kinda tricky!
    public set Union(set DataSetA, set DataSetB) {
        set DataSetC = new set();
        //Go ahead and make the new data set 
        //have everything SetA had
        DataSetC = DataSetA;


        //For every element of B, run it
        //through our Insertion method to add it
        //But how do I call the Insert method without
        //first creating a new instance of my ArrayMethods class?
        //it doesn't seem to want to let me call the Insert method....
        /*
         for (int i = 0; i < DataSetB.stuff.size(); i++){ 
            
         DataSetC.stuff.Insert(DataSetB.stuff.get(i), DataSetC);       
            
         } */
        return DataSetC;
    }

    @Override
    public set Intersection(set FirstSet, set SecondSet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public set Difference() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //NOT OUR FINAL INSERTION METHOD
    //WE NEED TO DO THIS WITH HASHING
    public void Insert(int Element, set DataSet) {
        //If the set already contains that element then
        //it needs to be rejected
        DataSet.stuff.add(Element);
    }

    //Determines if the element exists within the set
    //Again, this is suspiciously easy >_>
    public boolean ElementOf(int Element, set DataSet) {
        boolean YesOrNo = false;
        if (DataSet.stuff.contains(Element)) {
            return true;
        } else {
            return false;
        }

        /*
         for (int i = 0; i < DataSet.stuff.size(); i++){           
         if(i == Element)       
         YesOrNo = true;
         break;
         }
         return YesOrNo; */
    }

    //Returns the set as a String to be printed
    public String ToString(set DataSet) {
        String TheString = "";
        for (int i = 0; i < DataSet.stuff.size(); i++) {
            TheString += DataSet.stuff.get(i) + " ";

        }
        return TheString;
    }

    @Override
    public set DeepCopy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Prints out all data elements in the set
    public void SetPrint(set DataSet) {
        System.out.println("\rYour current elements are:");
        for (int i = 0; i < DataSet.stuff.size(); i++) {
            int item = DataSet.stuff.get(i);
            System.out.println(item + " ");

        }
    }

    //Returns the length of the Set that it's given
    public int SetLength(set DataSet) {

        return DataSet.stuff.size();
    }
}
