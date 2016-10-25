package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle (){
		setNrOfLegs(4);
		setName ("Eagle");
		setMigrate(false);
		setAvgFlightAltitude(232);
		
	}

	public Eagle (Integer nrOfLegs , String name , boolean migrate , Integer avfFlightAltittude  ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setMigrate(migrate);
		setAvgFlightAltitude(avgFlightAltitude);
	}

}
