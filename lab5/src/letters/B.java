package letters;

class B extends A {
    protected String b;

    void display() {
        System.out.println("B) There's bloody hands, can you wash these stains? " + b);
    }

    public B(String a,String b, X x) {
        super(a, x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
