/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivani
 */
import java.util.*;
import java.util.Map.Entry;
public class hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Map<String,Integer> n=new HashMap<>();
        n.put("first", 1);
        n.put("second", 2);
        n.put("third", 3);
		n.putIfAbsent("hird", 5);
		
		System.out.println(n.containsKey("first"));
        System.out.println(n.get("first"));
        
        System.out.println(n.remove("first"));
        
		System.out.println(n.keySet());
        System.out.println(n.values());
        System.out.println(n.entrySet());
        Set<Entry<String,Integer>> e=n.entrySet();
		for(Entry<String,Integer>entry:e ){
			entry.setValue(entry.getValue()*100);
		}
        System.out.println(n);        
    }
}
