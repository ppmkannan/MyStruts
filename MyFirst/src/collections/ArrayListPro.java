package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListPro {
	public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add(0,"Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println("First insertion: " + animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println("Insert @ 2:\t" + animals);
        
        List<String> zoo = new ArrayList<>(animals);
        System.out.println("Assign:\t"+ zoo);
        List<String> birds = new ArrayList<>();
        birds.add("Peacock");
        birds.add("Pigeon");
        birds.add("Sparrow");
        birds.add("Crow");
        
        
        //addAll
        zoo.addAll(birds);
        System.out.println("AddAll:\t" + zoo);
        
        //clear
//        zoo.clear();
//        System.out.println(zoo);
        
        
        //get and set(modify)
        System.out.println("Get @ 1:\t" + zoo.get(1));
        zoo.set(3, "Cow"); //only within index
        System.out.println("Set/Modify @ 3:\t" + zoo);
        
        //Remove
        zoo.remove(5);
        System.out.println("Remove @ 5:\t" + zoo);
        zoo.removeAll(birds);
        System.out.println("Remove all birds:\t" + zoo);
        zoo.removeIf(i -> i.startsWith("L"));
        System.out.println("Remove all C starting: \t" + zoo);
        
        //Contains
        System.out.println("Check for 'Tiger': " + zoo.contains("Tiger"));
        
        System.out.println("index of Tiger? : " + zoo.indexOf("Tiger"));
        
        //Sort
        Collections.sort(zoo);
        System.out.println("Sort: " + zoo);
        
        zoo.sort(new Comparator<String>() {
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        System.out.println("Sort: " + zoo);
    }

}
