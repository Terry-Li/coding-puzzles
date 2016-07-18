package com.algorithm.math;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



/**
 * @author Terry Li
 *
 * Given a set of integers, e.g., {1,2,3}, return its power set {{},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}}
 * 
 * Observations: original set size vs corresponding power set size: 1vs2, 2vs4, 3vs8, 4vs16 ...
 */
public class Powerset {
	
	public static Set<Set<Integer>> powerSet(Set<Integer> inputSet) {
		Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
		if (inputSet.isEmpty()) {
			sets.add(new HashSet<Integer>());
			return sets;
		}
		List<Integer> list = new ArrayList<>(inputSet);
		Integer head = list.get(0);
	    Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size())); 
	    for (Set<Integer> set : powerSet(rest)) {
	    	Set<Integer> newSet = new HashSet<Integer>();
	    	newSet.add(head);
	    	newSet.addAll(set);
	    	sets.add(newSet);
	    	sets.add(set);
	    }	
		return sets;
		
	}
	
	public static void main(String[] args) {
		 Set<Integer> mySet = new HashSet<Integer>();
		 mySet.add(1);
		 mySet.add(2);
		 mySet.add(3);
		 mySet.add(4);
		 for (Set<Integer> s : powerSet(mySet)) {
		     System.out.println(s);
		 }
	}

}
