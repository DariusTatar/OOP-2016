package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle (){
		setNrOfLegs(4);
		setName ("Turtle");
		setLayEggs(true);
		
	}
	
	public Turtle (Integer nrOfLegs , String name , boolean layEggs ){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setLayEggs(layEggs);
	}
}
