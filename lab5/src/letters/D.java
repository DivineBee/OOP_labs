package letters;

class D extends C {
    protected String d;

    //protected X x = new X (" xxxddd ");

    protected D (String a, String b,String c,String d, X x) {
        super(a,b,c,x);
        this.d = d;
    }

    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("D) Always money for bombs and not payslips " + d);
    }
}