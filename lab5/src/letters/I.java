package letters;

class I extends H {
    protected String i;
    protected I() {
    }
    protected I(String i) {
        this.i = i;
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