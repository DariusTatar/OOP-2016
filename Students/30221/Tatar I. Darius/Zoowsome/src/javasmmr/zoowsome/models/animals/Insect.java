package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private boolean canFly;
	private boolean isDangerous;

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;

	}

	public boolean getCanFly() {
		return canFly;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

}
