package letters;

class D extends C {
    protected String d;
    protected D(){
    }
    protected D(String d) {
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