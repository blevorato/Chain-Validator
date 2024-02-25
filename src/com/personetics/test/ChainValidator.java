package com.personetics.test;

import java.util.*;

public class ChainValidator {

    public static boolean validate(List<Node> nodes) {
        Map<Character, Set<Node>> dependencyMap = new HashMap<>();

        for (Node node : nodes) {
            if (node instanceof NodeNumber) {
                // add Dependency for Numbers
                String numStr = String.valueOf(((NodeNumber) node).number);
                if (node.hasDependency()) {
                    for (char c : numStr.toCharArray()) {
                        dependencyMap.putIfAbsent(c, new HashSet<>());
                        dependencyMap.get(c).add(node);
                    }
                }
            } else if (node instanceof NodeString) {
                // add Dependency for Letters
                String word = ((NodeString) node).string;
                if (node.hasDependency()) {
                    for (char c : word.toCharArray()) {
                        dependencyMap.putIfAbsent(c, new HashSet<>());
                        dependencyMap.get(c).add(node);
                    }
                }
            }
        }

        for (Node node : nodes) {
            if (node instanceof NodeString) {
                String word = ((NodeString) node).string;
                for (char c : word.toCharArray()) {
                    if (!dependencyMap.containsKey(c)) {
                        return false; // Dependency NOK
                    }
                }
            } else if (node instanceof NodeNumber) {
                String numStr = String.valueOf(((NodeNumber) node).number);
                for (char c : numStr.toCharArray()) {
                    if (!dependencyMap.containsKey(c)) {
                        return false; // Dependency NOK
                    }
                }
            }
        }
        return true;
    }
}
