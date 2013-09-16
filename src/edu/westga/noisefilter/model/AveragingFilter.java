package edu.westga.noisefilter.model;

import java.util.ArrayList;
/**
 * 
 * @author Kyle
 *
 */

public class AveragingFilter implements NoiseFilter {
/**
 * returns average of all data given.
 * @param samples of type Arraylist<Double>
 */
	@Override
	public double getBestMeasurement(ArrayList<Double> samples) {
		double sum = 0;
		for (double number : samples) {
			sum = sum + number;
		}
		return sum / samples.size();
	}

}
