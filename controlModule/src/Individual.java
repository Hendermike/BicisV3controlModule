

import java.util.Random;

/**
 * An "Individual" represents a single candidate solution. The core piece of
 * information about an individual is its "chromosome", which is an encoding of
 * a possible solution to the problem at hand. A chromosome can be a string, an
 * array, a list, etc -- in this class, the chromosome is an integer array. 
 * 
 * An individual position in the chromosome is called a gene, and these are the
 * atomic pieces of the solution that can be manipulated or mutated. When the
 * chromosome is a string, as in this case, each character or set of characters
 * can be a gene.
 * 
 * An individual also has a "fitness" score; this is a number that represents
 * how good a solution to the problem this individual is. The meaning of the
 * fitness score will vary based on the problem at hand.
 * 
 * @author bkanber
 *
 */
public class Individual {
	private double[] chromosome;
	private double fitness = -1;

	double lb = -1.5;
	double ub = 1.0;
	
	double deltaUb;
	double deltaLB;
	
	/**
	 * Initializes individual with specific chromosome
	 * 
	 * @param chromosome
	 *            The chromosome to give individual
	 */
	public Individual(double[] chromosome) {
		// Create individual chromosome
		this.chromosome = chromosome;
	}

	/**
	 * Initializes random individual.
	 * 
	 * This constructor assumes that the chromosome is made entirely of 0s and
	 * 1s, which may not always be the case, so make sure to modify as
	 * necessary. This constructor also assumes that a "random" chromosome means
	 * simply picking random zeroes and ones, which also may not be the case
	 * (for instance, in a traveling salesman problem, this would be an invalid
	 * solution).
	 * 
	 * @param chromosomeLength
	 *            The length of the individuals chromosome
	 */
	public Individual(int chromosomeLength) {

		this.chromosome = new double[chromosomeLength];
		for (int gene = 0; gene < chromosomeLength; gene++) {
				this.setGene(gene, initGeneValue());
		}
	}

	/**
	 * Gets individual's chromosome
	 * 
	 * @return The individual's chromosome
	 */
	public double[] getChromosome() {
		return this.chromosome;
	}

	/**
	 * Gets individual's chromosome length
	 * 
	 * @return The individual's chromosome length
	 */
	public int getChromosomeLength() {
		return this.chromosome.length;
	}

	/**
	 * Set gene at offset
	 * 
	 * @param gene
	 * @param offset
	 * @return gene
	 */
	public void setGene(int offset, double gene) {
		this.chromosome[offset] = gene;
	}

	/**
	 * Get gene at offset
	 * 
	 * @param offset
	 * @return gene
	 */
	public double getGene(int offset) {
		return this.chromosome[offset];
	}

	/**
	 * Store individual's fitness
	 * 
	 * @param fitness
	 *            The individuals fitness
	 */
	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	/**
	 * Gets individual's fitness
	 * 
	 * @return The individual's fitness
	 */
	public double getFitness() {
		return this.fitness;
	}
	
	
	/**
	 * Display the chromosome as a string.
	 * 
	 * @return string representation of the chromosome
	 */
	public String toString() {
		String output = "";
		output = "u(k, i) : " + this.chromosome[0] + " u(k+1, i) :" + this.chromosome[1] + " u(k, i-1) : " + this.chromosome[5] + " u(k+1, i-1) :" + this.chromosome[6];
		return output;
	}
	
	public double initGeneValue() {
		Random r = new Random();
		double randomValue = lb + (ub - lb) * r.nextDouble();
		return randomValue;
	}
	
	
	public double myRandom() {
		Random r = new Random();
		double randomValue = r.nextDouble();
		return randomValue;
	}
	
}
