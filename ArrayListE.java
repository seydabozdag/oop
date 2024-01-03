package CollectionE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListE {

    public static void main(String[] args) {
        // Declare ArrayList
        // ArrayList<String> al = new ArrayList<String>();   Homogeneus data
        // ArrayList<Integer> al = new ArrayList<Integer>();

        // List al = new ArrayList();
        ArrayList al = new ArrayList();
        // Add new elements to the arraylist
        al.add(50);
        al.add("Welcome");
        al.add(16.45);
        al.add('A');
        al.add(true);

        System.out.println(al);
        // size() that will give us how many objects are stored in this elements
        System.out.println("Number of elements in array list:\t" + al.size());

        // remove() that will let us remove any object or element from the array list ,
        // al.remove(1); // here 1 is index
        al.remove(true); // here true is an object
        System.out.println("After removing elements from the array list:\t" + al);

        // insert a new element
        // add(index,object)
        al.add(2, "Java");
        System.out.println("After insertion:\t" + al);

        // retrieve specific element
        // al.get(3); // 3 is index of element/object
        System.out.println("Retrieved element:\t" + al.get(3));

        // change or replace element
        al.set(3, "false");
        System.out.println("After replacing element:\t" + al);

        // search - contains() return true or false
        System.out.println(al.contains("Welcome"));
        System.out.println(al.contains("Ayse"));

        // isEmpty()
        System.out.println(al.isEmpty());

        // suppose we want to read all the elements in the array list
        // a. by using for loop
        System.out.println("Reading elements using for loop : ");

        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }

        // b. for each loop
        System.out.println("Reading elements for all each loop:");
        for(Object e : al) {
            System.out.println(e);
        }

        // c. iterator()
        System.out.println("Reading elements for using iterator method:");

        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next()); // printing element and moving to the next element
        }

        // Collection.sort()

        System.out.println("Element in the array list:\t" + al);
        Collections.sort(al);
        System.out.println("Element in the array list after sorting: \t" + al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Element in the array list after sorting in reverse order:\t" + al);
    }
}
