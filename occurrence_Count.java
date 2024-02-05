package Placement;

import java.util.LinkedHashMap;
import java.util.Map;
/*
display the cont how many times character occurence in the Sting
 */
public class occurrence_Count {
    public static void main(String[] args) {
        String str="ocCurrence";
        System.out.println(find_count(str));

    }
    public static String find_count(String str){
        LinkedHashMap<Character , Integer> hm = new LinkedHashMap<>();
        String s=str.toLowerCase();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            int num;
            if (hm.containsKey(c)) {
                num = hm.get(c);
                hm.put(c, num + 1);
            } else {
                hm.put(c, 1);
            }
        }
        String result = "";
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            result +=String.valueOf(entry.getKey());
            result +=String.valueOf(entry.getValue());
        }
return result;
    }
}
