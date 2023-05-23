public class Person {

    String name;
    int age;

    // methods

    // contructor method
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }

    public void showData(){
        System.out.println("the name is: "+name);
        System.out.println("the age is: "+age);
    }

}
