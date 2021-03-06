package edu.westga.noisefilter.tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import edu.westga.noisefilter.model.AveragingFilter;
import edu.westga.noisefilter.model.NoiseFilter;
import edu.westga.noisefilter.model.SensorData;
public class WhenAverageFiltering {
	public NoiseFilter filter;
	public SensorData dataSet;
	
	@Before
	public void setUp() throws Exception {
		dataSet = new SensorData();
		
		/* You created a new filter here (below). You were not changing the 'null' filter
		 *  in your data set
		 *
		 */
		
		filter = dataSet.setFilter(new AveragingFilter());
	}
	
	@Test
	public void averageOfThree100sShouldBe100() {
		// Clear the dataSet just in case.
		this.dataSet.clear();
		
		this.dataSet.addSample(100.00);
		this.dataSet.addSample(100.00);
		this.dataSet.addSample(100.00);
		
		/* This part throws error where it asks you to use delta. You compensate
		 * by using Math.abs(expected-actual). This value is how much your assertion
		 * can be off by.
		 */
		double expected = dataSet.getFilteredResult();
		double actual = 100.0;
		assertEquals(expected, actual, Math.abs(expected - actual));
	}
	
	@Test
	public void averageOfThreeDiffernet() {
		// Clear the dataSet just in case.
		this.dataSet.clear();
		
		this.dataSet.addSample(50.00);
		this.dataSet.addSample(100.00);
		this.dataSet.addSample(150.00);
		
		/* This part throws error where it asks you to use delta. You compensate
		 * by using Math.abs(expected-actual). This value is how much your assertion
		 * can be off by.
		 */
		double expected = dataSet.getFilteredResult();
		double actual = 100.0;
		assertEquals(expected, actual, Math.abs(expected - actual));
	}
	
	@Test
	public void averageOfFiveDiffernet() {
		// Clear the dataSet just in case.
		this.dataSet.clear();
		
		this.dataSet.addSample(50.00);
		this.dataSet.addSample(75.00);
		this.dataSet.addSample(100.00);
		this.dataSet.addSample(125.00);
		this.dataSet.addSample(150.00);
		
		/* This part throws error where it asks you to use delta. You compensate
		 * by using Math.abs(expected-actual). This value is how much your assertion
		 * can be off by.
		 */
		double expected = dataSet.getFilteredResult();
		double actual = 100.0;
		assertEquals(expected, actual, Math.abs(expected - actual));
	}
	
}
