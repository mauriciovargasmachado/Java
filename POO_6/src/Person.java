public class Person {

    // atributes
    String name;
    int age;
    String id;


    //methods

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String id) {
        this.id = id;
    }

    public void run(){
        System.out.println(name+" is runing!!!");
    }

    public void runner(int km){
        System.out.println("I have run "+km+ " kilometers!");
    }

}
