public class Person {

    // atributes
    private int age;
    private final String name;

    //Methods
    //Contructor

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void showdata(){
        System.out.println("The age is: "+age);
        System.out.println("The name is: "+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
