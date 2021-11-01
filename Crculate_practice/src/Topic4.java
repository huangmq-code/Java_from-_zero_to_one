import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int sum=0;
        while(i==0){
            i/=10;
            sum++;
        }
        System.out.println("一共有"+sum+"位");
    }
}
