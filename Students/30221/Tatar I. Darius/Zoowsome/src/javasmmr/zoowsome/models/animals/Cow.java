package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow (){
		setNrOfLegs(4);
		setName ("Cow");
		setNormalBodyTemp(34);
		setPercentBodyHair(89);
	}
	
	public Cow (Integer nrOfLegs , String name , float normalBodyTemo , float perrcentBodyHair){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setNormalBodyTemp(normalBodyTemp);
		setPercentBodyHair(percentBodyHair);
	}

}

