package edu.westga.noisefilter.model;

import java.util.ArrayList;


public class SensorData {

	private ArrayList<Double> data;
	private NoiseFilter filter;
	/**
	 * declares variable data of type ArrayList<Double> and variable filter of type null
	 */
		public SensorData() {
			data = new ArrayList<Double>();
			filter = null;
		}
		/**
		 * Adds a sample of type double to data.
		 * @param samples
		 */
		public void addSample(double samples) {
			Double data1 = new Double(samples);
			data.add(data1);
		/**
		 * sets filter to noiseFilter so it is no longer null
		 * @param noiseFilter
		*/	
		}
		public NoiseFilter setFilter(NoiseFilter noiseFilter) {
			filter = noiseFilter;
			return filter;
		}
		/**
		 * @precondition Filter cannot be null
		 * @return a filtered version of the data set that gives the average
		 */
		public double getFilteredResult() {
			if (filter == null) {
				throw new IllegalArgumentException("filter may not be null");
			}
			return filter.getBestMeasurement(data);
			
				
			
		}
}
