package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	
	private Integer nrOfLegs ;
	private String name;
		
	public Integer getNrOfLegs (){
		return nrOfLegs;
	}
	
	public String getName (){
		return name;
	}
	
	public void setName (String name){
		this.name=name;
	}
	
	public void setNrOfLegs (int nrOfLegs){
		this.nrOfLegs=nrOfLegs;
	}

}
