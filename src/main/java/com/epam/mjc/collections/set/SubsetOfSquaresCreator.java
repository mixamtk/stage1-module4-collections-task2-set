package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> result = new TreeSet<>();
        for (Integer elem: sourceList) {
            result.add(elem * elem);
        }
        return result.subSet(lowerBound, true, upperBound, true);
    }
}
