package org.example1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailFastMap {

    public static void main(String[] args) {
        //Map<Integer,String> map=new HashMap<>();
        Map<Integer,String > map=new ConcurrentHashMap<>();
        map.put(1,"One");
        map.put(2,"Two");

        Iterator it =map.keySet().iterator();

        while(it.hasNext()){
            Integer key=(Integer) it.next();
            System.out.println(key+" : "+ map.get(key));
            map.put(3,"Three");
        }
    }
}
