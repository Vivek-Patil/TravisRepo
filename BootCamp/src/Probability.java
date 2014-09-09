/**
 * Created by vivekpatil on 8/18/14.
 */
//Job Understands Likelihood Of An Event To Occur
public class Probability {

	public static final int certain = 1;
	private final double value;

	Probability(double value) {
		this.value = value;
	}

	public boolean equals(Probability other) {
		if (other == null)
			return false;
		if (this.hashCode() == other.hashCode()) return true;
		return this.value == other.value;
	}


	public Probability negation() {
		return new Probability(certain - this.value);
	}

	public Probability and(Probability other) {
		return new Probability(this.value * other.value);
	}

	public Probability or(Probability other) {
		return this.negation().and(other.negation()).negation();
	}
}
