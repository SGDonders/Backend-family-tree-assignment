public class Pet {

    /* Instance variables */

    public String name;
    public int age;
    public String species;
    public String owner;

    /* Constructors */

    public Pet() {
    }

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    /* Getters & Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    /* Methods */

    public void addOwner() {

    }
}
