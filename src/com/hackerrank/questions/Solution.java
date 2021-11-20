package com.hackerrank.questions;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;

class MaximumOccuringCharacter {

        /*
        QUESTION:
        Given a string, return the character that appears the maximum number of times in the string,



        HINTS:
         * Complete the 'maximumOccurringCharacter' function below.
         *
         * The function is expected to return a CHARACTER.
         * The function accepts STRING text as parameter.
         */

        public static char maximumOccurringCharacter(String text) {
            Map<Character, Integer>map = new HashMap<>();
            for(int i=0; i<text.length(); i++){
                if(map.containsKey(text.charAt(i))){
                    map.replace(text.charAt(i), map.get(text.charAt(i))+1);

                }
                else{
                    map.put(text.charAt(i), 1);
                }
            }
            int max =0;
            for (Map.Entry<Character, Integer> map1: map.entrySet()){
                System.out.println(map1.getKey() + " "+map1.getValue());
                if(map1.getValue() > max){
                    max = map1.getValue();
                }
            }
            for (Map.Entry<Character, Integer> map1: map.entrySet()){
                if(map1.getValue() ==max){
                    return map1.getKey();
                }
            }

            return 0;

        }

    }

    public class Solution {
        public static void main(String[] args)  {

            char result = MaximumOccuringCharacter.maximumOccurringCharacter("helloWorld");
            System.out.println(result);
        }
    }


