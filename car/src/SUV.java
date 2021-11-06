/**
 * @author 黄明权
 * @date
 * @description
 */
public class SUV extends Car{
    String brand="路虎";

    public SUV (String name ,int avg_speed,String state ) {
        Car c=new Car();
        c.setName(name);
        c.setAvg_speed(avg_speed);
        c.setState(state);
    }
    void show() {
        System.out.println(name + "的品牌是" + brand);
    }
     void run() {
        System.out.println(name+"行驶的平均速度为："+avg_speed);
        show();
    }
}
