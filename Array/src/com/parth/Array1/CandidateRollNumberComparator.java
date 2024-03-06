package com.parth.Array1;

import java.util.Comparator;

public class CandidateRollNumberComparator implements Comparator<Candidate> {


	public int compare(Candidate c1, Candidate c2) {
		
		if(c1.getRollNumber() == c2.getRollNumber())
		   return 0;
		else if(c1.getRollNumber() > c2.getRollNumber())
           return 3;
        else
        	return -4;
        	    
	}
	

}
