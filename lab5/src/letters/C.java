package letters;

class C extends B {
    protected String c;
    protected C() {
    }

    public C(String c) {
        this.c = c;
    }

    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("C) Watch the truth get indoctrinated " + c);
    }
}

