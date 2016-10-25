package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	
	public Crocodile (){
		setNrOfLegs(4);
		setName ("Crocodile");
		setLayEggs(true);
		
	}
	
	public Crocodile (Integer nrOfLegs , String name , boolean layEggs ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setLayEggs(layEggs);
	}


}
