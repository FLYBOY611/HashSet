package hashset;

//Because everyone loves having an interface
public interface HashADT {

//Returns returns true if the two sets are equal
    public boolean Equality(set DataSetA, set DataSetB);

//Returns true if the set is a subset 
    public boolean isSubset(set DataSetA, set DataSetB);

//Given two sets, returns a set that contains all the elements of both
    public set Union(set DataSetA, set DataSetB);

//Given two sets return a set that contains
//all the elements contained within set A and B
    public set Intersection(set FirstSet, set SecondSet);

//Given two sets return a set that contains 
//all elements that are not shared between A and B
    public set Difference(set FirstSet, set SecondSet);

//Inserts a element into the particular set
//Duplicate elements can't be inserted
    public void Insert(int Element, set DataSet);

//Returns true if the element is in the set
    public boolean ElementOf(int Element, set DataSet);

//Returns the set as a string to be printed
    public String ToString(set DataSet);

//We need a copy constructor that performs a deep copy
//I guess we do it here?
    public set DeepCopy(set FirstSet, set SecondSet, int choice);

//Prints out the contents of the given set
    public void SetPrint(set DataSet);

//Returns the number of elements in the given set
    public int SetLength(set DataSet);
}
