package letters;

class G extends F {
    protected String g;

    protected G(String a, String b,String c,String d,String e,String f,String g, X x) {
        super(a,b,c,d,e,f,x);
        this.g = g;
    }
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
    void display() {
        System.out.println("G) Heard they want to see you misplaced, and " + g);
    }
}