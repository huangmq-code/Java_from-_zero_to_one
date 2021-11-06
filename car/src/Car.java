/**
 * @author 黄明权
 * @date
 * @description 定义车类
 */
public class Car {
    /**
     * avg_speed定义平均速度
     * state 定义状态：停止，启动和运行中
     */
    static String name;
    static int avg_speed=60;
    static  String state;
    void run() {}
    public void start(Car c){
        if(c.state.equals("停止")){
            c.state = "启动";
        }
        System.out.println(c.name+"启动，平均速度为"+c.avg_speed);
    }
    public void stop(Car c){
        if(c.state.equals("启动")||c.state.equals("运行中")){
            c.state = "停止";
        }
        System.out.println(c.name+"速度开始减慢，最终停止");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Car.name = name;
    }

    public static int getAvg_speed() {
        return avg_speed;
    }

    public static void setAvg_speed(int avg_speed) {
        Car.avg_speed = avg_speed;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Car.state = state;
    }
}
