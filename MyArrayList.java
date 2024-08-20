/******************************************
 *  File : Topic_10_Lab - MyArrayList.java
 *  Author : Celia Ho   
 *  Last Modified : Mon May 06 2024
 *  Description : 
    --> A similar class to ArrayList has a static array of capacity 10 (discussed in class). This array can be of any type (generic type).

    --> Create your own ArrayList called MyArrayList with the following methods: constructors, getters and setters, an add method. Throw an exception if you exceed the limit of the array. Implement a remove method that only removes the last element in the array. Also, implement a toString method that returns all the elements of the array.
    
    Also implement a Demo class to test MyArrayList.
 *******************************************/

 // ArrayList of elements of generic type E
 public class MyArrayList<E> {    
    // Replace "E[] mal;" with "Object[] mal;"
    private Object[] mal;
    private int size;
    private static final int CAPACITY = 10;


    // *****Constructors*****

    public MyArrayList() {
        // mal = new T[capacity];     // Replace generic type with parent "Object"
        this.mal = new Object[CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int capacity) throws Exception {
        this.mal = new Object[CAPACITY];size = 0;
        if (size == CAPACITY) {
            throw new Exception("Array is full");
        }
    }


    // *****Getters & Setters*****

    public Object[] getMal() {
        return mal;
    }

    public void setMal(Object[] elements) {
        mal = elements;         // NB
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    // setCapacity method removed because constancy of CAPACITY makes it obsolete


    // *****Other Method Definitions*****

    // add Method
    public void add(E element) throws Exception {
        if (size == CAPACITY) {
            throw new Exception("MyArrayList is full");
        } else {
            mal[size++] = element;
        }
    }

    // remove Method
    public void remove() throws Exception {
        if (size == 0) {
            throw new Exception("MyArrayList is empty"); 
        } else {
            mal[size - 1] = null;   // Nullify the value of the last element
            size--; // Decrement the ArrayList size
        }
    }

    // Ref. class notes 04.25.2024
    @Override
    public String toString() {
        String str = "[ ";
        
        for (int i = 0; i < size; i++) {
            str += mal[i] + " ";
        }

        str += "]";

        return str;
    }


    
}
