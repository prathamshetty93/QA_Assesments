package JavaAssessment;

import java.util.*;

public class CollectionsImplementation {

    public static void  main(String[] args){

        //Array List operations
        ArrayList<Integer> array=new ArrayList<>();

        array.add(3);
        array.add(6);
        array.add(1);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(2);
        array.add(15);
        array.add(21);
        array.add(18);

        //Printing all the elements
        System.out.println(array);


        //Add an element at 8th position
        array.add(8,5);
        System.out.println(array);

        //add index value to each element
        for (int i:array){
            System.out.println(i+array.indexOf(i));
        }

        //Remove an element
        array.remove(8);
        System.out.println(array);

        //print sub-array from index 2 to 6
        List<Integer> subarray=array.subList(2,6);

        System.out.println(subarray);

        //clear arrayList
        array.clear();
        System.out.println(array);







        Vector<Integer> vector=new Vector<>();

        vector.add(9);
        vector.add(6);
        vector.add(10);
        vector.add(15);
        vector.add(21);
        vector.add(22);
        vector.add(23);
        vector.add(24);
        vector.add(25);

        //Print all the elements
        System.out.println(vector);

        //Add an element at 3rd position
        vector.add(3,20);
        System.out.println(vector);

        //check if a given value present in vector
        System.out.println(vector.contains(15));

        //Print 4th and 8th element
        System.out.println(vector.get(4));

        System.out.println(vector.get(8));

        //Remove 4th element
        vector.remove(4);
        System.out.println(vector);




        PriorityQueue<Integer> queue=new PriorityQueue<>();

        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(12);
        queue.add(3);
        queue.add(18);

        //Print all the elements in the queue
        System.out.println(queue);


        //Delete the duplicate element
        int q=0;
        for (Integer i:queue){
            q=0;
            for (Integer j:queue){
                if (i.equals(j)){
                    q++;
                }
            }
            if (q>1){
                queue.remove(i);
                break;
            }
        }

        System.out.println(queue);

        //Print and remove the element
        System.out.println("The deleted element is "+queue.remove());
        System.out.println(queue);





        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Pratham");
        map.put(2,"Akash");
        map.put(3,"vaibav");
        map.put(4,"Pavan");
        map.put(5,"Manish");
        map.put(6,"Nithesh");
        map.put(7,"Vipin");
        map.put(8,"Bharath");
        map.put(9,"Laksh");
        map.put(10,"Riya");

        //Printing all the key - value pairs
        for (int i: map.keySet()){
            System.out.println(i +" "+ map.get(i));
        }

        //Printing the length of the hash map
        System.out.println(map.size());

        //Replacing a Value from its key
        map.replace(7,"Karthik");

        System.out.println(map.get(7));

        //Remove a key-value pair
        map.remove(4);

        for (int i: map.keySet()){
            System.out.println(i +" "+ map.get(i));
        }

        //Clears the hashmap
        map.clear();

        System.out.println(map);




    }

}
