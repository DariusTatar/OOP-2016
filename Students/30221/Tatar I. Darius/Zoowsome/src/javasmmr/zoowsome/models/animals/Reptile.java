package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	private boolean layEggs;

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public boolean getLayEggs() {
		return layEggs;
	}

}
