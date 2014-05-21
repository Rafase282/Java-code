/****************************************************************************
 *  Compilation:  javac PercolationStats.java
 *  Execution:  java PercolationStats 200 100
 *  Dependencies: Percolation.java algs4.jar stdlib.jar
 *
 *  Percolation class for Monte Carlos simulation.
 *
 ****************************************************************************/

/**
 * @author Rafael Rodriguez
 *
 */
public class PercolationStats {

	private int testCount;
	private int openSites;
	private double [] results;
	private int rowSize;

	/**
	 * Perform T independent computational experiments on an N-by-N grid.
	 * @param size How big the Percolation grid will be.
	 * @param test How many tests to be run.
	 */
	public PercolationStats(int size, int test) {

		rowSize = size;
		int testQuantityLeft = test;

		if (rowSize <= 0 || testQuantityLeft <= 0) {
            throw new java.lang.IllegalArgumentException();
        }

		testCount = 0;
		openSites = 0;
		results = new double[testQuantityLeft];

		while (testQuantityLeft-- > 0) {
			int simulation = simulate(rowSize);
			results[testQuantityLeft] = (double)
					simulation / rowSize / rowSize;
			testCount++;
			openSites += simulation;
		}

	}

	/**
	 *
	 * @param rowSize2 The N-by-N grid for Percolation.
	 * @return A Monte-Carlo simulation.
	 */
	private int simulate(int rowSize2) {

		int openSite = 0;
		Percolation percolocation = new Percolation(rowSize);

        while (!percolocation.percolates()) {
            int row = 1 + StdRandom.uniform(rowSize);
            int column = 1 + StdRandom.uniform(rowSize);

            if (!percolocation.isOpen(row, column)) {
                openSite++;
                percolocation.open(row, column);
            }
        }
		return openSite;
	}

	/**
	 * Sample mean of percolation threshold.
	 * @return mean
	 */
	public double mean() {
		double mean = (double) openSites
				/ testCount / rowSize / rowSize;
		return mean;
	}

	/**
	 *
	 * @return Sample standard deviation of percolation threshold.
	 */
	public double stddev() {
		if (1 == testCount) {
            return Double.NaN;
        }
		double stdDeviation = StdStats.stddev(results);
		return stdDeviation;
	}

	/**
	 * @return Returns lower bound of the 95% confidence interval.
	 */
	public double confidenceLo() {
		double lowConfidence = (mean() - (1.96 * stddev())
        		/ Math.sqrt(testCount));
		return lowConfidence;
	}

	/**
	 * @return returns upper bound of the 95% confidence interval
	 */
	public double confidenceHi() {
		double highConfidence = (mean() + (1.96 * stddev())
        		/ Math.sqrt(testCount));
		return highConfidence;
	}

	/**
	 * Test client.
	 * @param args Standard I/O.
	 */
	public static void main(final String[] args) {

		int gridRoot = StdIn.readInt();
        int numberOfSperiments = StdIn.readInt();
        PercolationStats simulation = new PercolationStats(
        		gridRoot, numberOfSperiments);

        StdOut.println("Mean 			= "
        		+ simulation.mean());
        StdOut.println("Standard Deviation 	= "
        		+ simulation.stddev());
        StdOut.println("95% confidence interval = " + simulation.confidenceLo()
        		+ ", " + simulation.confidenceHi());

	}

}
