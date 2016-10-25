package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey (){
		setNrOfLegs(2);
		setName ("Monkey");
		setNormalBodyTemp(34);
		setPercentBodyHair(94);
	}
	
	public Monkey (Integer nrOfLegs , String name , float normalBodyTemo , float perrcentBodyHair){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setNormalBodyTemp(normalBodyTemp);
		setPercentBodyHair(percentBodyHair);
	}

}
