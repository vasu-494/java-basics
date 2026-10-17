class Animal
{   
    private String species;
    private String animal;

    public Animal()
    {
        species = "Mammal";
        animal = "Human";
    }

    public Animal(String species, String animal)
    {
        this.species = species;
        this.animal = animal;
    }

    public String getSpecies() 
    {
        return species;
    }

    public void setSpecies(String species) 
    {
        this.species = species;
    }

    public String getAnimal() 
    {
        return animal;
    }

    public void setAnimal(String animal) 
    {
        this.animal = animal;
    }

    

}

public class Constructor 
{
    public static void main(String[] args) 
    {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Mammal", "Lion");

        // new Animal(); ---> anonymous object creation - creates object in the Heap, but does not have a reference from the Stack

        System.out.println(animal1.getSpecies() + " : " + animal1.getAnimal());
        System.out.println(animal2.getSpecies() + " : " + animal2.getAnimal());

    }
}
