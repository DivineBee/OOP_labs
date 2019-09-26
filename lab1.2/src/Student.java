public class Student {
    private String name;
    private int age;
    private float mark;
    //constructor
    //this is used to invoke or initiate current class constructor
    public Student(String name, int age, float mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    //get method is used to obtain or retrieve
    // a particular variable value from a class.
    public String getName(){
        return name;
    }
    public float getMark(){
        return mark;
    }
}
