package br.upe.dsc.de.problem;

public class RandomPeaksProblem implements IProblem {

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return "Random Peaks";
	}

	/**
	 * {@inheritDoc}
	 */
	public int getDimensionsNumber() {
		return 2;
	}

	/**
	 * {@inheritDoc}
	 */
	public double getLowerLimit(int dimension) {
		return 0;
	}

	/**
	 * {@inheritDoc}
	 */
	public double getUpperLimit(int dimension) {
		return 30;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean compareFitness(double pBestFitness, double currentPositionFitness) {
		return currentPositionFitness < pBestFitness;
	}

	/**
	 * {@inheritDoc}
	 */
	public double getFitness(double... dimension) {
		Double x = dimension[0];
		Double y = dimension[1];

		return +5 * Math.exp(-0.1 * ((x - 15) * (x - 15) + (y - 20) * (y - 20))) - 2
			* Math.exp(-0.08 * ((x - 20) * (x - 20) + (y - 15) * (y - 15))) + 3
			* Math.exp(-0.08 * ((x - 25) * (x - 25) + (y - 10) * (y - 10))) + 2
			* Math.exp(-0.1 * ((x - 10) * (x - 10) + (y - 10) * (y - 10))) - 2
			* Math.exp(-0.5 * ((x - 5) * (x - 5) + (y - 10) * (y - 10))) - 4
			* Math.exp(-0.1 * ((x - 15) * (x - 15) + (y - 5) * (y - 5))) - 2
			* Math.exp(-0.5 * ((x - 8) * (x - 8) + (y - 25) * (y - 25))) - 2
			* Math.exp(-0.5 * ((x - 21) * (x - 21) + (y - 25) * (y - 25))) + 2
			* Math.exp(-0.5 * ((x - 25) * (x - 25) + (y - 16) * (y - 16))) + 2
			* Math.exp(-0.5 * ((x - 5) * (x - 5) + (y - 14) * (y - 14)));
	}
	
	public boolean verifyConstraints(double... variables) {
		return true;
	}
}
