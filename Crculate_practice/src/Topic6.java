/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic6 {
    public static void main(String[] args) {
        double money=1000;
        for (int i=0; i<5;i++){
            money=money*(1+0.003);
        }
        System.out.println("5年后，获得的本金是"+money+"元");
    }
}
