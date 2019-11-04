package letters;

class B extends A {
    protected String b;
    protected B() {
    }

    void display() {
        System.out.println("B) There's bloody hands, can you wash these stains? " + b);
    }

    protected B(String b) {
        this.b = b;
    }

    public B(String a, X x, String b) {
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
