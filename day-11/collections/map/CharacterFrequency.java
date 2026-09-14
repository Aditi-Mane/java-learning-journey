package map;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";

        //to store in key-value map format
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        //to find first non-repeating character
        Character firstNonRepeating = null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                firstNonRepeating = c;
                break;
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" has a frequency of "+entry.getValue());
        }
        System.out.println();
        System.out.println("The first non-repeating character is: "+firstNonRepeating);
    }
}
/* OUTPUT
p has a frequency of 1
a has a frequency of 1
r has a frequency of 2
g has a frequency of 2
i has a frequency of 1
m has a frequency of 2
n has a frequency of 1
o has a frequency of 1

The first non-repeating character is: p
*/