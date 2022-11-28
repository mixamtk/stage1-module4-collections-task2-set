package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer elem:sourceList) {
            int x = elem;
            if (x % 2 == 0) {
                do {
                    result.add(x);
                    x /= 2;
                } while (x % 2 == 0);
                result.add(x);
            } else {
                result.add(x);
                result.add(2 * x);
            }
        }
        return result;
    }
}
