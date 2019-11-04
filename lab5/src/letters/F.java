package letters;

class F extends E {
    protected String f;
    protected F() {
    }
    protected F(String f) {
        this.f = f;
    }
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
    void display() {
        System.out.println("F) Little hands, can you hold on tighter? " + f);
    }
}