import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description  演示三个实数
 */
public class Dome {
    public static void main(String[] args) {
        int val_1;
        int val_2;
        int val_3;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        val_1=sc.nextInt();
        System.out.println("请输入第二个数");
        val_2=sc.nextInt();
        System.out.println("请输入第三个数");
        val_3=sc.nextInt();
        if(val_1<val_2){
            if(val_1<val_3){
                System.out.println(val_1);
                System.out.println(val_3<val_2?val_3:val_2);
                System.out.println(val_3>val_2?val_3:val_2);
            }else{
                System.out.println(val_3);
                System.out.println(val_1<val_2?val_1:val_2);
                System.out.println(val_1>val_2?val_1:val_2);
            }
        }else{
            if (val_2>val_3){
                System.out.println(val_3);
                System.out.println(val_2);
                System.out.println(val_1);
            }else{
                System.out.println(val_2);
                System.out.println(val_1<val_3?val_1:val_3);
                System.out.println(val_1>val_3?val_1:val_3);
            }
        }
    }
}
