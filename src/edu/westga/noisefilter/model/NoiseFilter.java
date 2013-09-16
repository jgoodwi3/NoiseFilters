package edu.westga.noisefilter.model;

import java.util.ArrayList;

/**
 * 
 * 
 * @author Kyle
 *
 */
public interface NoiseFilter {

	double getBestMeasurement(ArrayList<Double> samples);
}
