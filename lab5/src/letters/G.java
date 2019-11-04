package letters;

class G extends F {
    protected String g;
    protected G() {
    }

    protected G(String g) {
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