public class Studient extends Person{

    private int studientCode;
    private float finalNote;


    //studient Class constructor
    public Studient(String name,String lastName,int age,int studientCode,float finalNote){

        super(name,lastName,age);
        this.studientCode=studientCode;
        this.finalNote=finalNote;

    }

    public void showData(){
        System.out.println("The name of the student is: "+getName());
        System.out.println("The name of the student is: "+getLastName());
        System.out.println("The name of the student is: "+getAge());
        System.out.println("The name of the student is: "+studientCode);
        System.out.println("The name of the student is: "+finalNote);
    }

}
