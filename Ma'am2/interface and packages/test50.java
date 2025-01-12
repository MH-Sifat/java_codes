package Uni.Dept.mymain;
import java.util.Date;
import Uni.Welcome;
import Uni.Dept.Goal;
import Uni.Dept.*;
public class test50 {
    public static void main(String args[]){
        Date t=new Date();
        System.out.println("todays date is "+t.toString());
        Welcome w=new Welcome();
        w.msg();
        Goal g=new Goal();
        g.goal();
        staffs r=new staffs();
        r.addstaffs();
        r.removestaffs();

    }
}
