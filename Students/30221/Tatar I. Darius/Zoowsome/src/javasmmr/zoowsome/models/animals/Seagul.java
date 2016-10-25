package javasmmr.zoowsome.models.animals;

public class Seagul extends  Bird {

	public Seagul (){
		setNrOfLegs(2);
		setName ("Seagul");
		setMigrate(true);
		setAvgFlightAltitude(232);
		
	}

	public Seagul (Integer nrOfLegs , String name , boolean migrate , Integer avfFlightAltittude  ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setMigrate(migrate);
		setAvgFlightAltitude(avgFlightAltitude);
	}

}
