/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic3 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int c;
        for (int i=3; i<=12; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("经过十二个月，兔子有"+b);
    }
}
