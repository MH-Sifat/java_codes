package inter2;
import java.lang.Math;
interface polygonal{
    void getArea();
    //normal method
    default void getPerimeter(int a, int b, int c){
        System.out.println("The perimeter of trianlge is"+(a+b+c));
    }
}
class triangle implements polygonal{
    private int a, b,c;
    private double s, area;// s=half perimeter
    // square root (s*(s-a)*(s-b)*(s-c)
    triangle(int a, int b, int c)
    {this.a=a;
    this.b=b;
    this.c=c;
    s=0;}
    public void getArea(){
        s=(double)(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area "+area);
    }
}
public class Access {
    public static void main(String args[]){
        polygonal p=new triangle(3,4,5 );
        p.getArea();
        p.getPerimeter(3,4,5);
        triangle t=new triangle(2,3,4);
        t.getArea();
        t.getPerimeter(2,3,4);

    }
}
