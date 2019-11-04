package letters;

class E extends D {
    protected String e;
    protected E() {
    }
    protected E(String e) {
        this.e = e;
    }
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
    void display() {
        System.out.println("E) Mother won't get to kiss her child " + e);
    }
}