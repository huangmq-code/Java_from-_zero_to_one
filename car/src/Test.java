import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car c1=new SUV("SUV",60,"停止");
        Car c2=new Truck("Truck",60,"停止");
        Car c3=new Vieche("Vieche",60,"停止");
        Driver d=new Driver();
        //车手开SUV
        System.out.println("车手开SUV：");
        d.drive(c1);
        //车手开Vieche
        System.out.println("车手开Vieche：");
        System.out.println("使用氮气前");
        d.drive(c3);
        System.out.println("使用氮气后");
        ((Vieche) c3).setNitrogen_accelerates(true);
        //车手开卡车
        System.out.println("车手开卡车");

        d.drive(c2);


    }
}
