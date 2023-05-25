package Packet_1;

public class Person {

    private final String name;
    private int age;


    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData(){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
