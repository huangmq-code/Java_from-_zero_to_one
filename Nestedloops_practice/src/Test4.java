import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description4、 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如5+55+555+5555+55555(此时共有5个数相加)。
 * 程序分析：关键是计算出每一项的值。。
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个小于10的正整数");
        int i=sc.nextInt();
        int temp=0;
        int sum=0;
        temp=i;
        sum=i;
        for (int j=0; j<i-1;j++) {
            temp = temp * 10 + i;
            sum += temp;
        }
        System.out.println("输出值为："+sum);
    }
}
