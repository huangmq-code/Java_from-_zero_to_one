/**
 * @author 黄明权
 * @date
 * @description
 */
public class Truck extends Car{
    int wheels=20;
    public Truck(String name ,int avg_speed,String state ) {
        Car c=new Car();
        c.setName(name);
        c.setAvg_speed(avg_speed);
        c.setState(state);
    }
    void run() {
            System.out.println(name+"行驶的平均速度为："+(avg_speed+(wheels-4)*3));
    }
}
