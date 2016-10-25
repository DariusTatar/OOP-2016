package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.KomodoDragon;

public class ReptileFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception  {
		if(Constants.Animals.Reptiles.Crocodile.equals(type))
			return new Crocodile();
		else
			if(Constants.Animals.Reptiles.Turtle.equals(type))
				return new Turtle();
			else
				if(Constants.Animals.Reptiles.KomodoDragon.equals(type))
					return new KomodoDragon();
				else 
					throw new Exception("Invalid animal exception!");	
	}
}