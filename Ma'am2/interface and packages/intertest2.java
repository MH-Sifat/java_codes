package inter3;
import java.util.*;
class person3{
String name;
person3(String n){
    this.name="Person "+n;
}}
interface Mother{ void FeedChildren();}
interface Wife{void CallHusband();}
class WifeandMother extends person3 implements Mother,Wife{
    WifeandMother(String n){
        super(n);
        this.name="Wife and Mother "+n;}
    public void FeedChildren(){
        System.out.println(this.name+" is feeding her children");
    }
    public void CallHusband(){
        System.out.println(this.name+" is calling her husband");
    }


}
public class intertest2 {
    public static void main(String args[]){
        person3 q=new person3("Amitabh");
        WifeandMother t=new WifeandMother("Jaya");
    System.out.println("P is "+q.name);
    System.out.println("W is "+t.name);
        t.FeedChildren();
        t.CallHusband();
    }
}
