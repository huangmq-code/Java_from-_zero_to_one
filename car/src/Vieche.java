/**
 * @author 黄明权
 * @date
 * @description
 */
public class Vieche extends Car{
    static boolean Nitrogen_accelerates =false;
    public Vieche(String name ,int avg_speed,String state ) {
        Car c=new Car();
        c.setName(name);
        c.setAvg_speed(avg_speed);
        c.setState(state);
    }
    void run() {
        if(Nitrogen_accelerates){
            System.out.println("车辆运行的平均速度为："+avg_speed);
        }else{
            System.out.println("车辆运行的平均速度为："+(avg_speed+10));
        }
    }

    public boolean isNitrogen_accelerates() {
        return Nitrogen_accelerates;
    }

    public void setNitrogen_accelerates(boolean nitrogen_accelerates) {
        Nitrogen_accelerates = nitrogen_accelerates;
    }
}
