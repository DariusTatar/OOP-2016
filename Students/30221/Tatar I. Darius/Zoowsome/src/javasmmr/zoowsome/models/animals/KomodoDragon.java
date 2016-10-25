package javasmmr.zoowsome.models.animals;

public class KomodoDragon extends Reptile {
	
	public KomodoDragon (){
		setNrOfLegs(4);
		setName ("KomodoDragon");
		setLayEggs(true);
		
	}
	
	public KomodoDragon (Integer nrOfLegs , String name , boolean layEggs ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setLayEggs(layEggs);
	}
}

