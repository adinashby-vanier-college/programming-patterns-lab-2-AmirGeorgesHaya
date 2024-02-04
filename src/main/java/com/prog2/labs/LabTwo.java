package com.prog2.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.String;

/**
 * @author adinashby
 *
 */
public class LabTwo {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

        ArrayList<Integer> average = new ArrayList<>();
        average.add(5);
        average.add(10);
        average.add(15);
        average.add(20);

        averageValue(average);

        List<String> upper = Arrays.asList("hellO", "james");

        convertToUpperCase(upper);

        List<String> filtered = Arrays.asList("geORGE", "aQW", "aPP", "fRR");
        filterStrings(filtered);

        
        List<Integer> quest4 = Arrays.asList(3, 44, 59, 99, 6);
        commaSeparatedStrings(quest4);
        
    }

    /**
     * Please refer to the README file for question(s) description
     *
     * @param list
     * @return
     */
    public static Double averageValue(List<Integer> list) {

        return list.stream()
                .mapToDouble(x -> x)
                .average()
                .getAsDouble();

    }

    public static List<String> convertToUpperCase(List<String> list) {

        List<String> listUpper = list
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return listUpper;
    }

    public static List<String> filterStrings(List<String> list) {

        return list.stream()
                .filter(x -> x.startsWith("a"))
                .filter(x -> x.length() <= 3)
                .collect(Collectors.toList());

    }

    public static String commaSeparatedStrings(List<Integer> list) {
       
        
        
        return list.stream()
            .map(e -> (e % 2 == 0 ? "e" : "o") + e)// since we 
                //are mapping with letters, the stream returns a string 
                .collect(Collectors.joining(","));
    
                
                
               
                
                          
               
                
                
                
                
                
                
    }
}
