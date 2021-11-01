import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int i=sc.nextInt();
        if(((i/10000)==(i%10))&&((i/1000-(i/10000)*10)==((i%100)/10))){
            System.out.println(i + "是回文数");
        }
    }
}
