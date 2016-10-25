package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tuna;

public class AquaticFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception  {
		if(Constants.Animals.Aquatics.Octopus.equals(type))
			return new Octopus();
		else
			if(Constants.Animals.Aquatics.Shark.equals(type))
				return new Shark();
			else
				if(Constants.Animals.Aquatics.Tuna.equals(type))
					return new Tuna();
				else 
					throw new Exception("Invalid animal exception!");	
	}
}