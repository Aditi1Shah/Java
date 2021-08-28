import java.util.*;
 class box{
    
    float length;
    float breadth;
    float height;
    void volume()
    {
        System.out.println("Volume of the box is : ");
        System.out.println(length*breadth*height);
    }
    box(float l,float b,float h)
    {
        length = l;
        breadth = b;
        height = h;
    }
}
public class box4{
    public static void main(String args[])
    {
        System.out.println("Enter length breadth and height for the box");
        Scanner sc = new Scanner(System.in);
        float len = sc.nextFloat();
        float bre = sc.nextFloat();
        float hei = sc.nextFloat();
        box b = new box(len,bre,hei);
        b.volume();
    }
}