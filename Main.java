import java.util.*;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
//Task 1: Generate a collection of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.out.println("Task 1: " + list1);
//Task 2: Using the Random() class, fill the created collection with values from -10 to 10. Size is also 10
        //(max - min + 1) + min

        ArrayList<Integer> list2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10 - (-10) + 1) - 10; // Generate a random number from -10 to 10
            list2.add(value);
        }
        System.out.println("Task 2: " + list2);


//Task 3: Create a new collection by overwriting elements from the base collection into it
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(5);
        list3.add(0);
        list3.add(3);
        list3.add(1);
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
            list4.add(list3.get(i));
        }
        System.out.println("Task 3: " + list4);
//Create a collection with unique values
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(1);
        set1.add(4);
        set1.add(9);
        set1.add(1);
        System.out.println("Task 4: " + set1);
//Sort the underlying collection
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(9);
        set2.add(7);
        set2.add(1);
        set2.add(5);
        set2.add(3);
        set2.add(-2);
        System.out.println("Task 5: " + set2);
// Find min and max value from underlying collection
// First solution if it is TreeSEt. I am using the collection above set2

        for (int i = 0; i < set2.size(); i++) {
        }
        System.out.println("Task 6: first solution");
        System.out.println("Min value is :" + set2.first());
        System.out.println("Min value is :" + set2.last());
        //Second solution for ArrayList
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(4);
        list5.add(1);
        list5.add(9);
        list5.add(2);
        list5.add(5);
        System.out.println("Task 6: second solution");
        Integer min = Collections.min(list5);
        Integer max = Collections.max(list5);
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);

//Find the sum of the elements of a collection
        ArrayList<Integer> list6 = new ArrayList<>();
        list6.add(9);
        list6.add(8);
        list6.add(0);
        list6.add(3);
        list6.add(5);
        int sum = 0;
        for (int i = 0; i < list6.size(); i++) {
            sum = sum + list6.get(i);
        }
        System.out.println("Task 7: " + sum);
//Create a collection containing only positive numbers of the underlying collection
        ArrayList<Integer> list7 = new ArrayList<>();
        list7.add(7);
        list7.add(-1);
        list7.add(4);
        list7.add(0);
        list7.add(-6);
        ArrayList<Integer> list8 = new ArrayList<>();
        for (int i = 0; i < list7.size(); i++) {
            if (list7.get(i) >= 0) {
                list8.add(list7.get(i));
            }
        }
        System.out.println("Task 8 " + list8);
//Create a method that will return a boolean value if the collection contains the value passed to the input parameters. If there is no specified number, output false
        System.out.println("Task 9: " + valueContains(16, 99));
// Count the number of occurrences of a specific number
        ArrayList<Integer> list9 = new ArrayList<>();
        list9.add(7);
        list9.add(-1);
        list9.add(4);
        list9.add(7);
        list9.add(-6);
        list9.add(-6);
        list9.add(7);
        int occ = 7;
        int counter = 0;
        for (int i = 0; i < list9.size(); i++) {
            if (list9.contains(7) && list9.get(i) == 7) {
                counter++;
            }
        }
        System.out.println("Task 10: Number 7 has " + counter + " occurrences");
//Expand the collection in reverse order
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> reversedList = new ArrayList<>();
        list11.add(5);
        list11.add(9);
        list11.add(1);
        list11.add(0);
        for (int i = list11.size() - 1; i >= 0; i--) {
            reversedList.add(list11.get(i));
        }
        list11.addAll(reversedList);
        System.out.println("Task 11: " + list11);
//Swap first and last element
        ArrayList<Integer> list12 = new ArrayList<>();
        list12.add(1);
        list12.add(2);
        list12.add(3);
        list12.add(4);
        if (!list12.isEmpty()) {
            int temporary = list12.get(0);
            list12.set(0, list12.get(list12.size() - 1));
            list12.set(list12.size() - 1, temporary);
        }

        System.out.println("Task 12: " + list12);
//Find the second largest number in the collection
        ArrayList<Integer> list13 = new ArrayList<>();
        list13.add(10);
        list13.add(60);
        list13.add(20);
        list13.add(5);
        list13.add(52);
        Collections.sort(list13);
        System.out.println("Task 13: " + list13.get(list13.size() - 2));
// Check if a collection is a palindrome
        ArrayList<String> list14 = new ArrayList<>();
        list14.add("M");
        list14.add("A");
        list14.add("D");
        list14.add("A");
        list14.add("J");
        boolean isPalindrome = false;
        for (int i = 0; i < list14.size(); i++) {
            for (int j = list14.size() - 1; j >= 0; j--) {
                if (list14.get(i) == list14.get(j)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }
        }
        System.out.print("Task 14: ");
        System.out.println(isPalindrome ? "The Collection is a palindrome" : "The Collection is not a palindrome");

        //Write a method that adds 1000000 elements to an ArrayList and a LinkedList. Write another method that selects an element at random 100,000 times from a populated list. Measure the time spent on it.

        ArrayList<Integer> list15 = new ArrayList<>();
        LinkedList<Integer> list16 = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list15.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.print("Task 15: ");
        System.out.println("Time spend on adding 1000000 elements to ArrayList is " + (endTime1 - startTime1) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list16.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.print("Task 15: ");
        System.out.println("Time spend on adding 1000000 elements to LinkedList is " + (endTime2 - startTime2) + " milliseconds");
    Random random2 = new Random();
    long startTime3 = System.currentTimeMillis();
    for(int i=0; i<100000; i++){
        int index= random2.nextInt(list15.size());
        int element = list15.get(index);
    }
    long endTime3 = System.currentTimeMillis();
        System.out.println("Time spent on selecting 100000 random elements to ArrayList: is " +(endTime3-startTime3) + " milliseconds");


        Random random3 = new Random();
        long startTime4 = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            int index2 = random3.nextInt(list16.size());
            int element2 = list16.get(index2);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Time spent on selecting 100000 random elements to LinkedList: is " +(endTime4-startTime4) + " milliseconds");

    }





    static boolean valueContains (int a, int b) {
        ArrayList<Integer> list10 = new ArrayList<>();
        list10.add(1);
        list10.add(9);
        list10.add(8);
        list10.add(0);
        list10.add(3);
        for (int i = 0; i < list10.size(); i++) {
            if (list10.get(i) == a || list10.get(i) == b) {
                return true;
            }
        }
        return false;
    }

}

