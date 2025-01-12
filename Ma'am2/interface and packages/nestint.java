package nest;
interface outer{
    void m1();
    interface inner{
        void m2();
    }
}
class my implements outer{
    public void m1(){
        System.out.println("This is from outer");
    }
    public void m2(){
        System.out.println("This is from inner");
    }
}
class ur implements outer.inner{
    public void m1(){
        System.out.println("This is from outer");
    }
    public void m2(){
        System.out.println("This is from inner");
    }
}
public class nestint {
    public static void main(String args[]){
        my c=new my();
        c.m1();
        c.m2();
        ur d=new ur();
        d.m2();
        d.m1();
    }
}
