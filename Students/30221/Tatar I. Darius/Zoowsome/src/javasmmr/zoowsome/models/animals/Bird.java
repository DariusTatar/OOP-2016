package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{

	private boolean migrate;
	protected Integer avgFlightAltitude;

	public void setMigrate(boolean migrate) {
		this.migrate = migrate;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public boolean getMigrate() {
		return migrate;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;

	}

}
