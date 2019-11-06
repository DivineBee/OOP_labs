package letters;

class H extends G {
    protected String h;

    private X x = new X (" xxxhhh ");

    protected H(String a, String b,String c,String d,String e,String f,String g,String h, X x) {
        super(a,b,c,d,e,f,g,x);
        this.h= h;
    }
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
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
        System.out.println("H) Politicians, can you see this pain? " + h);
    }
}