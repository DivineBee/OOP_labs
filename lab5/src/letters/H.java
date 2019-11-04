package letters;

class H extends G {
    protected String h;
    protected H() {
    }

    protected H(String h) {
        this.h = h;
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