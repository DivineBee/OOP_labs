package letters;

class A {
    protected String a;
    protected A() {
    }

    protected X x = new X (" xxx ");

    public A (String a){
        this.a = a;
    }

    public  String toString(){
        return "A { " +
                "a = '" + a + '\'' +
                ", x = " + x +
                '}';
    }

    public A (String a, X x){
        this.a = a;
        this.x = x;
    }

    void display() {
        System.out.println("A) 80 dead in a foreign place " + a);
    }
}