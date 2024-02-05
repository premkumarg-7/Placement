package Placement;

import java.util.*;
/*
Group Anagram
 */
public class Anagram {
    public static void main(String[] args) {
        String [] str= {"ate","tea","eat","tan","bat","ant","nat"};
        System.out.println(find_anagram(str));
    }
    public static List<List<String>> find_anagram(String[] str){
        Map<String,List<String>> anagram = new HashMap<>();

        for(String var:str){
            char[] charArr = var.toCharArray();
            Arrays.sort(charArr);
            String sorted=String.valueOf(charArr);
            if(!anagram.containsKey(sorted)){
                anagram.put(sorted,new ArrayList<>());
            }
            anagram.get(sorted).add(var);
        }
        return new ArrayList<>(anagram.values());
    }
}
