package variables;

public class Animal {
	//private-accesSpecifier
	private String animalName;
	private String animal_Color;
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimal_Color() {
		return animal_Color;
	}

	public void setAnimal_Color(String animal_Color) {
		this.animal_Color = animal_Color;
	}



	public static void main(String[] args) {
		Animal a=new Animal();
		a.animalName="Lion";
		a.animal_Color="white";
		System.out.println("Animal Name is : "+a.animalName+"& "+"color is : "+a.animal_Color);

	}

}
