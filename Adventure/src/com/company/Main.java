package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //the numbers get converted to Integer via automatic
        //autoboxing
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));
        //note the form of the Location constructor



        int loc = 1;
        //System.out.println(locations.get(loc).getDescription());

        //remember that the while(true) allows for an infinite loop
        //until you break it.
        //In this case, the scanner.nextInt(); looks for the user input
        //which changes the value of loc. Since we're in an infinite loop,
        // System.out.println(locations.get(loc).getDescription()); will run
        //with the new value of loc and return the corresponding description.
        //As specified, when you the value of int is 0 by user input, the loop
        //will be broken
        //Additionally, if any number is not a member of the locations HashMap
        //it will return "You cannot go in that direction"
        //What I don't understand is how the loop gets broken when the above
        //message is returned.
        //We get a "Process finished with exit code 1" instead of exit code 0
        //When I googled the exit codes. Apparently, exit code 0 means the program
        //was exited without an problems. Exit code 1 gets returned when there is an error
        //I'm assuming that the moment you enter a number that is outside our bounds
        //that the while loop is no longer true and is now false.
        //I somewhat confirmed this by running
        // System.out.println(locations.containsKey(loc));
        // the console returns true. Now, since the exclamation point makes it false
        //the while loop is no longer true and thus the loop is broken.
        //Another explanation might be (but also makes sense actually)
        //is that when it loops back to the first sout
        //the locations.containsKey(loc).getDescription(); cannot
        //retrieve any descriptions, if say, loc was equal to 25

        while(true) {
            //What the following code does is print out the description
            //based on the value of loc
            //if you had int loc = 4 and then ran
            //System.out.println(locations.get(loc).getDescription());
            //you would get "You are in a valley beside a stream"
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)) {
                System.out.println("You cannot go in that direction");
            }

        }



    }
}
