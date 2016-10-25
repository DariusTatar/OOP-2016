package javasmmr.zoowsome.models.animals;

public class Octopus  extends Aquatic {

	public Octopus() {
		setNrOfLegs(8);
		setName("Octopus");
		setAvgSwimDepth(75);
		setWaterType(Water.saltwater);
	}

	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, Water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

}



