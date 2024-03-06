package com.parth.Array1;

import java.util.Comparator;

public class CandidateNameComparator implements Comparator<Candidate>{
      
	public int compare (Candidate c1, Candidate c2) {
		
		return c1.getName().compareTo(c2.getName());
		
		
	}
}
