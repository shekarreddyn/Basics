package com.test.collections.HashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest8 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();

        p1.setName("Shekar");
        p1.setAge(23);
        p1.setCity("Hyderabad");

        p2.setName("Goutham");
        p2.setAge(22);
        p2.setCity("Banglore");

        p3.setName("Mani");
        p3.setAge(26);
        p3.setCity("Jaipur");

        p4.setName("Akash");
        p4.setAge(24);
        p4.setCity("Chennai");

        p5.setName("Sagar");
        p5.setAge(27);
        p5.setCity("Mumbai");

        p6.setName("Vamshi");
        p6.setAge(25);
        p6.setCity("Delhi");

        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1001, p1);
        map.put(1002, p2);
        map.put(1003, p3);
        map.put(1004, p4);
        map.put(1005, p5);
        map.put(1006, p6);

		/*
         * Set<Map.Entry<Integer, Person>> entries = map.entrySet();
		 *
		 * for( Map.Entry<Integer, Person> entry :entries) { Person p = map.get(entry);
		 */

        int maxAge = 0;
        String name = null;
        String c = null;
        int s = 0;
        int x = 0;
        int y = 0;
        String youngest = null;
        int b = 0;
        int sumOfAges = 0;

        Set<Integer> keyset = map.keySet();
        for (Integer key : keyset) {
            Person p = map.get(key);
            System.out.println(key + " " + p.getName() + " " + p.getAge() + " " + p.getCity());

			/*
			   1. Who is most elder person ?
			   2. Who is a person from Hyderabad ?
			   3. Who among all is younger ?
			   4. What is the total sum of all Person's age ?
			 */
            if (maxAge < p.getAge()) {
                maxAge = p.getAge();
                name = p.getName();
            }

            if (p.getCity() == "Hyderabad") {
                c = p.getName();

            }

            if (x == 0) {
                b = p.getAge(); // this is for assigning the first value to the b

                if (b < p.getAge()) {
                    y = p.getAge();
                    youngest = p.getName();
                }
            }

            if (x < p.getAge()) {
                sumOfAges = sumOfAges + p.getAge();

            }
        }

        System.out.println("-------------------------------");
        System.out.println("The most elder Person is " + name + "  " + "and his age is " + maxAge);
        System.out.println("The person from hyderabad is" + " : " + c);
        System.out.println("Amooung all the younger guy is " + youngest);
        System.out.println("Sum of all their ages is " + " : " + sumOfAges);
    }

}