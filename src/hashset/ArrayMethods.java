package hashset;

//Here we will implement all our methods that we declared in the ADT
public class ArrayMethods implements HashADT {

    //This totally looks like it would work but does it 
    //account for the same data elements being in different locations?
    public boolean Equality(set DataSetA, set DataSetB) {
        if(DataSetA.stuff.equals(DataSetB.stuff)){
            return true;
        } else{
            return false;
        }
            
    }

    @Override
    public boolean isSubset(set DataSetA, set DataSetB) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public set Union(set DataSetA, set DataSetB) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        DataSet.stuff.add(Element);
    }

    //Determines if the element exists within the set 
    public boolean ElementOf(int Element, set DataSet) {
        boolean YesOrNo = false;
        for (int i = 0; i < DataSet.stuff.size(); i++){           
            if(i == Element)       
                YesOrNo = true;
            break;
            }
        return YesOrNo;
    }

    //Returns the set as a String to be printed
    public String ToString(set DataSet) {
        String TheString = "";
        for (int i = 0; i < DataSet.stuff.size(); i++){           
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
        for (int i = 0; i < DataSet.stuff.size(); i++){
            int item = DataSet.stuff.get(i);
            System.out.println(item + " ");           
            
            }
    }

    //Returns the length of the Set that it's given
    public int SetLength(set DataSet) {
        
        return DataSet.stuff.size();
    }




    
}
