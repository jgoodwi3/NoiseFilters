package edu.westga.noisefilter.tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.westga.noisefilter.model.AveragingFilter;
import edu.westga.noisefilter.model.MedianFilter;
import edu.westga.noisefilter.model.NoiseFilter;
import edu.westga.noisefilter.model.SensorData;

public class WhenMedianFiltering {
	public NoiseFilter filter;
	public SensorData dataSet;
	@Before
	public void setUp() throws Exception {
		dataSet = new SensorData();
		
		/* You created a new filter here (below). You were not changing the 'null' filter
		 *  in your data set
		 *
		 */
		
		filter = dataSet.setFilter(new MedianFilter());
	}
	
	
	@Test
	public void zeroSamplesShouldFail(){
		this.dataSet.clear();
		
		double expected = dataSet.getFilteredResult();
		double actual = 100.0;
		assertEquals(expected, actual, Math.abs(expected - actual));
		
	}
	
	@Test
	public void twoSamplesShouldFail(){
		this.dataSet.clear();
		this.dataSet.addSample(75.00);
		this.dataSet.addSample(125.00);
		double expected = dataSet.getFilteredResult();
		double actual = 100.0;
		assertEquals(expected, actual, Math.abs(expected - actual));
		
	}

}
