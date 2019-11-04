package letters;

class J extends I {
    protected String j;
    protected J() {
    }
    protected J(String j) {
        this.j = j;
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
                '}';
    }
    void display() {
        System.out.println("J) Tell me how all these wars been sponsored " + j);
    }
}