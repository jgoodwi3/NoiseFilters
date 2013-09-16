package edu.westga.noisefilter.model;

import java.util.ArrayList;
/**
 * 
 * @author Kyle
 *
 */

public class MedianFilter implements NoiseFilter {
/**
 * returns average of all data given.
 * @param samples of type Arraylist<Double>
 */
	@Override
	public double getBestMeasurement(ArrayList<Double> samples) {
		int median = -1; // Just make this a random number.
		
		ArrayList<Double> test = new ArrayList<Double>(); 
		test.addAll(samples);
		
		int size = samples.size();
		// Now you have to find a way to find the median. 
//		if(size%2 == 0){
//			// even amount of data. Might be a problem/
//			median = (size/2 + size/2 +1 )/2; 
//			// get the average of the two median numbers. 
//			// Though I think your professor want you to make this part fail in testing.
//		}
//		else{
			//odd amount of data. Ideal.
			median = size/2 + 1;
//		}
		
		return test.get(median);
	}

}

