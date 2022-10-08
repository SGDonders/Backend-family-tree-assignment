import java.util.ArrayList;
import java.util.List;

public class Person {

    /* Instance variables */

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;

    private List<Person> siblings;
    private List<Person> children;
    private List<Person> pets;

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

        child.setFather(father);
        List<Person> children = father.getChildren();
        children.add(child);
        father.setChildren(children);

        child.setMother(mother);
        List<Person> childs = mother.getChildren();
        childs.add(child);
        mother.setChildren(childs);

    }

    public void addChild(Person parent, Person child) {

    }


    public void addPet() {

    }

    public void addSibblings() {

    }

    public void getGrandChildren() {

    }
}
