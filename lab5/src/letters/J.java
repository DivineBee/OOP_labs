package letters;

class J extends I {
    protected String j;

    protected J(String a, String b,String c,String d,String e,String f,String g,String h,String i,String j, X x) {
        super(a,b,c,d,e,f,g,h,i,x);
        this.j= j;
    }
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
               // ", x=" + x +
                '}';
    }
    void display() {
        System.out.println("J) Tell me how all these wars been sponsored " + j);
    }
}