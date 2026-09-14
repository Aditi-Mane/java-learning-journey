package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful and java is popular";
        String[] words = str.trim().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println();
        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);
    }
}
/* OUTPUT
java -> 3
powerful -> 1
and -> 2
is -> 3
easy -> 1
popular -> 1

{and=2, easy=1, is=3, java=3, popular=1, powerful=1}
 */
