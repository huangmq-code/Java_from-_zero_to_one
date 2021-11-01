import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int i=sc.nextInt();
        int sum=1;
        int a=i;
        while(i>0){
            sum*=i;
            i--;
        }
        System.out.println(a+"的阶乘结果为："+sum);
    }
}
