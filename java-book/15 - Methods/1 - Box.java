public class Box {
    double width,height,depth;

    // displaying value
    void volume()
    {
        System.out.print("Volume is : ");

        System.out.println(width*height*depth);
    }

    // returning value
    double volumee()
    {
        return width*height*depth;
    }

    // setting diminsion
    void setDim(double w, double h, double d)
    {
        this.width = w;
        
        this.height = h;

        this.depth = d;
    }
}
