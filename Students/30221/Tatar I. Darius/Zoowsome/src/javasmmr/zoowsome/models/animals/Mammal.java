package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

	protected float normalBodyTemp;
	protected float percentBodyHair;

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public void setPercentBodyHair(float percentBodyHair) {
		this.percentBodyHair = percentBodyHair;
	}

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public float percentBodyHair() {
		return percentBodyHair;
	}

}
