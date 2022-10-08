import java.util.List;

public class Person {

    /* Instance variables */

    public String name;
    public String middleName;
    public String lastName;
    public String sex;
    public int age;
    public Person mother;
    public Person father;

    public List<Person> siblings;
    public List<Person> children;
    public List<Person> pets;

    /* Constructors */

    public Person() {
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    /* Getters & Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Person> pets) {
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getPets() {
        return pets;
    }

    /* Methods */

    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);


    }

    public void addChild() {

    }

    public void addPet() {

    }

    public void sibling() {

    }

    public void getGrandChildren() {
        
    }
}
