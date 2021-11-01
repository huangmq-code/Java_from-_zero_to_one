/**
 * @author 黄明权
 * @date
 * @description 单循环第一题
 */
public class Topic1 {
    public static void main(String[] args) {
        int i=1020;
        int days=0;
        while(i>0){
            i=i/2;
            i-=2;
            days++;
            System.out.println("经过多少天"+days+"天，剩余"+i);
        }
        System.out.println("第"+days+"天卖完");
    }
}
