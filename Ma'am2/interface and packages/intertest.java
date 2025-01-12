package inter;
interface Animal {
    int speed=5;// final and static
    void walk();// abstract
}
interface Mammal{
    void eat();
}
class Dog12 implements Animal,Mammal {
    public int getSpeed(){
        return speed;
    }
 public void walk(){
        System.out.println("Dogs can walk at "+getSpeed());
    }
    public void eat(){
        System.out.println("Dogs can eat");
    }
}
public class intertest {
    public static void main(String args[]){
        Animal a= new Dog12();
        Dog12 d=new Dog12();
        a.walk();
        d.walk();
        d.eat();
    }
}
