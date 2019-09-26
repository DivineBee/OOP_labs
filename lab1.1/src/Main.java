public class Main {
    public static void main(String[] args) {
        Monitor mon1 = new Monitor("LG", "red", 12, 34, 1920);
        Monitor mon2 = new Monitor("AOC", "blue", 17, 20, 720);
        if (mon1.name.equals(mon2.name)) {
            System.out.println("Same brand");
        } else {
            System.out.println("Different brands" + " first is " + mon1.name + " second is " + mon2.name);
        }
        if (mon1.color.equals(mon2.color)) {
            System.out.println("Same color");
        } else {
            System.out.println("Different colors" + " first is " + mon1.color + " second is " + mon2.color);
        }
        if (mon1.height == mon2.height) {
            System.out.println("Same height");
        } else {
            System.out.println("Different height");
        }
        if (mon1.width == mon2.width) {
            System.out.println("Same width");
        } else {
            System.out.println("Different width");
        }
        if (mon1.resol == mon2.resol) {
            System.out.println("Same resolution");
        } else {
            System.out.println("Different resolution");
        }
    }
}