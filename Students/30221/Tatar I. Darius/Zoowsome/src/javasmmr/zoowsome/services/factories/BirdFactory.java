package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Seagul;
import javasmmr.zoowsome.models.animals.Crow;

public class BirdFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception  {
		if(Constants.Animals.Birds.Eagle.equals(type))
			return new Eagle();
		else
			if(Constants.Animals.Birds.Crow.equals(type))
				return new Crow();
			else
				if(Constants.Animals.Birds.Seagul.equals(type))
					return new Seagul();
				else 
					throw new Exception("Invalid animal exception!");	
	}
}