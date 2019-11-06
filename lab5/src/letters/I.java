package letters;

class I extends H {
    protected String i;

    protected I(String a, String b,String c,String d,String e,String f,String g,String h,String i, X x) {
        super(a,b,c,d,e,f,g,h,x);
        this.i= i;
    }
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                //", x=" + x +
                '}';
    }

    void display() {
        System.out.println("I) And why don't they listen " + i);
    }
}