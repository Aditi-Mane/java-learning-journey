package map;

import java.util.HashMap;
import java.util.Map;

public class MapCRUD {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        //add students
        students.put("Aditi", 85);
        students.put("Rahul", 72);
        students.put("Sneha", 91);
        students.put("Vishal", 78);

        //print the map
        System.out.println(students);

        //get Rahul's marks
        if(students.containsKey("Rahul")){
            System.out.println("Rahul's marks are: "+students.get("Rahul"));
        }

        //update Rahul's marks to 80
        students.put("Rahul", 80);
        System.out.println("Rahul's updated marks are: "+students.get("Rahul"));


        //check if Sneha exists
        if(students.containsKey("Sneha")){
            System.out.println("Sneha exists");
        } else {
            System.out.println("Doesn't exist");
        }

        //check whether 91 exists as a value
        if(students.containsValue(91)){
            System.out.println("91 exists as a value");
        } else {
            System.out.println("Doesn't exist");
        }

        //remove Vishal
        students.remove("Vishal");

        //print all keys
        System.out.println(students.keySet());

        //print all values
        System.out.println(students.values());

        System.out.println();

        //iterate through all entries
        for(Map.Entry<String, Integer> entry: students.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
/* OUTPUT
{Rahul=72, Sneha=91, Aditi=85, Vishal=78}
Rahul's marks are: 72
Rahul's updated marks are: 80
Sneha exists
91 exists as a value
[Rahul, Sneha, Aditi]
[80, 91, 85]

Rahul -> 80
Sneha -> 91
Aditi -> 85
 */
