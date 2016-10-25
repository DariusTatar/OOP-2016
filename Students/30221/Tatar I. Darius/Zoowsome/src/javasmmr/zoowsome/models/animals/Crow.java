package javasmmr.zoowsome.models.animals;

public class Crow extends Bird {

	public Crow (){
		setNrOfLegs(2);
		setName ("Crow");
		setMigrate(false);
		setAvgFlightAltitude(232);
		
	}

	public Crow (Integer nrOfLegs , String name , boolean migrate , Integer avfFlightAltittude  ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setMigrate(migrate);
		setAvgFlightAltitude(avgFlightAltitude);
	}

}
