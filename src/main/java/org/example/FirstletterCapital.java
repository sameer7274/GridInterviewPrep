package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstletterCapital {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("john","jan","tom","John","sameer");
        List<String> result=names.stream().filter(n->n.startsWith("j"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);

    }
}
