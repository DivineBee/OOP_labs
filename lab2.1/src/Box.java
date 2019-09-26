public class Box {
    double height, width, depth;
    //constructor with no parameters
    Box()
    {
        width = height = depth = 1;
    }
    //with 1 parameter
    Box(double value){
        width=value;
        height=value;
        depth = value;
    }
    //with 3 parameters
    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    //compute and return area
    double getArea()
    {
        return 2 * depth *height + 2 * depth * width + 2 * width * height;
    }
    // compute and return volume
    double getVolume()
    {
        return width * height * depth;
    }
}