import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic10 {
    public static void main(String[] args) {
        int sig=0;
        int dou=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int i= sc.nextInt();
        while(i!=-1){
            if(i%2==1){
                sig++;
            }else{
                dou++;
            }
            System.out.println("请再输入一个数字：");
            i= sc.nextInt();
        }
        if(i!=-1){
            if(i%2==1){
                sig++;
            }else{
                dou++;
            }
        }
        System.out.println("您一个输入的奇数个数"+sig+"您一个输入的偶数个数"+dou);
    }
}
