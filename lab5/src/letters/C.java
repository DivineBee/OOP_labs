package letters;

class C extends B {
    protected String c;

    protected C (String a, String b, String c, X x) {
        super (a,b,x);
        this.c= c;
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

