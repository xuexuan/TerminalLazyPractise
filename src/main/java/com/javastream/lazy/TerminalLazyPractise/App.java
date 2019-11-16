package com.javastream.lazy.TerminalLazyPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> elements = new ArrayList<String>();
        elements.add("One flew over the cuckoo's nest");
        elements.add("To kill a muckingbird");
        elements.add("Gone with the wind");
        
        Stream<String> stream = elements.stream().map((value) -> {PrintRealTime(value); return value.replace("Gone", "One");});
        System.out.println("trigger terminal call");
        Boolean bMatch = stream.anyMatch((value) -> {return value.contains("One");});
        System.out.println(bMatch);
    }
    
    static void PrintRealTime(Object...objects)
    {
    	System.out.println(objects.toString());
    }
}
