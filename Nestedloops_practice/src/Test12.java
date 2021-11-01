import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Test12 {
    public static void main(String[] args) {
        int[] num={};
        num=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("请一个不多于5位的正整数");
        int i=sc.nextInt();
        int temp=1;
        int k=0;
        for (int j=0; j<5; j++) {
            num[j]=i%10;
            i/=10;
            if(i>0){
                temp++;
            }else{
                break;
            }
        }
        System.out.println("您输入"+temp+"位数");
        while(num[k]!=0){
            System.out.print(num[k]);
            k++;
        }
    }
}
