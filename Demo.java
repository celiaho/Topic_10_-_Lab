/******************************************
 *  File : Topic_10_Lab - MyArrayList.java
 *  Author : Celia Ho   
 *  Last Modified : Sun May 05 2024
 *  Description : 
    A similar class to ArrayList has a static array of capacity 10 (discussed in class). This array can be of any type (generic type).
    
    Create your own ArrayList called MyArrayList with the following methods: constructors, getters and setters, an add method. Throw an exception if you exceed the limit of the array. Implement a remove method that only removes the last element in the array. Also, implement a toString method that returns all the elements of the array.
    
    --> Also implement a Demo class to test MyArrayList.
 *******************************************/

 public class Demo {
    public static void main(String[] args) throws Exception {
        
        MyArrayList<Integer> myIntegerList = new MyArrayList<>();
        myIntegerList.add(3);
        myIntegerList.add(1);
        myIntegerList.add(4);
        myIntegerList.add(1);
        myIntegerList.add(5);
        
        MyArrayList<String> myStringList = new MyArrayList<>();
        myStringList.add("habibi");     // Arabic
        myStringList.add("qīn_ài_de");  // Mandarin Chinese
        myStringList.add("mon_chéri");  // French
        myStringList.add("Schatz");     // German
        myStringList.add("tesoro");     // Italian
        myStringList.add("mero_pyaar"); // Nepali
        myStringList.add("querido(a)"); // Portuguese
        myStringList.add("draga_mea");  // Romanian
        myStringList.add("cariño");     // Spanish
        myStringList.add("kasintahan"); // Tagalog

        System.out.println("My generic ArrayList class adds elements with its add method and prints out array lists of different data types with its toString method:\n   myIntegerList has " + myIntegerList.getSize() + " elements: " + myIntegerList + "\n   myStringList has " + myStringList.getSize() + " elements: " + myStringList + "\n");

        System.out.println("It can also remove the last element of an array with its remove method. Here are my ArrayLists after calling remove():");
        myIntegerList.remove();
        myStringList.remove();
        System.out.println("   myIntegerList now has " + myIntegerList.getSize() + " elements: " + myIntegerList + "\n   myStringList now has " + myStringList.getSize() + " elements: " + myStringList + "\n");

    
    }
}
