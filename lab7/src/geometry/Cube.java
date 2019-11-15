package geometry;

public class Cube implements GeometricBody {
    double side;

    public Cube(double side){this.side = side;}

    @Override
    public double getVolume(){
        return side*side*side;
    }

    @Override
    public double getSurface(){
        return 6*(side*side);
    }

    @Override
    public void print(){
        System.out.println("The area of the cube is : " + getSurface());
        System.out.println("The volume of the cube is : " + getVolume());
    }
}
