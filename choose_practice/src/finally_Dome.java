import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class finally_Dome {
    public static void main(String[] args) {
        int val_1=0;
        int val_2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        val_1=sc.nextInt();
        System.out.println("请输入第二个数");
        val_2=sc.nextInt();
        System.out.println(val_1<val_2?val_1:val_2);
        System.out.println(val_1>val_2?val_1:val_2);
    }
}
