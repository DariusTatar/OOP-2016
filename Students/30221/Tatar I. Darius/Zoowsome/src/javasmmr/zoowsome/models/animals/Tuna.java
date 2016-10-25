package javasmmr.zoowsome.models.animals;

public class Tuna   extends Aquatic {

	public Tuna () {
		setNrOfLegs(0);
		setName("Tuna");
		setAvgSwimDepth(75);
		setWaterType(Water.saltwater);
	}

	public Tuna(Integer nrOfLegs, String name, Integer avgSwimDepth, Water waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
}
