import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description3、 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n不等于k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int n=sc.nextInt();
        int c=n;
        System.out.print(n+"=");
        int j=0;
        int[] numbers=new int[100];
        int m=0;
        for (int i = 2; i <= n; i++) {
            for(j=2;j<i;j++) {
                if (i % j == 0) {
                    numbers[m] = j;
                    n = n / j;
                    m++;
                    break;
                }
            }
//            if (i==j){
//                System.out.println(i);
//            }
        }
        m=0;
        while(numbers[m]!=0){
            System.out.print("*");
            System.out.print(numbers[m]);
            m++;
        }
    }
}
