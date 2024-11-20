/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;









/**
 *
 * @author Ken Healy
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        
        
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(34);
        
        myArrayList.add(1,8); //add at index 1
        myArrayList.add(0,8945);
        myArrayList.add(3, 45);
      
        myArrayList.remove(2); 
          
       
        System.out.println(myArrayList);
        
        System.out.println("***FIRST LOOP****");
       for(int i = 0; i < myArrayList.size(); i++)
        {
            //print out all values in the array
            System.out.println("The value in element " + i + " is " + myArrayList.get(i)); 
        }
        /*
           Find the location of a specific value and then change that value
            a couple of steps needed
        in this case find where 45 is stored and change it to 36
        */
        int position = myArrayList.indexOf(45);
        System.out.println("The location of 45 is " + position);
         myArrayList.remove(position);
         myArrayList.add(position, 36);
         // END OF CODE TO CHANGE 45 to 36 BUT KEEP THE LOCATION THE SAME
         
         System.out.println("**SECOND LOOP***");
        for(int i = 0; i < myArrayList.size(); i++)
        {
            //print out all values in the array
            System.out.println("The value in element " + i + " is " + myArrayList.get(i)); 
        }
        
    }
    
}
