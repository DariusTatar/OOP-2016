package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger (){
		setNrOfLegs(4);
		setName ("Tiger");
		setNormalBodyTemp(34);
		setPercentBodyHair(89);
	}
	
	public Tiger (Integer nrOfLegs , String name , float normalBodyTemo , float perrcentBodyHair){
		setNrOfLegs(nrOfLegs);
		setName (name);
		setNormalBodyTemp(normalBodyTemp);
		setPercentBodyHair(percentBodyHair);
	}

}
