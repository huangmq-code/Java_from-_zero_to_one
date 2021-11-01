import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 输入一个十进制数，将其转换成二进制数。（使用循环实现）
 */
public class Test8 {
    public static void main(String[] args) {
        int[] numbers = new int[1024];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个十进制数字");
        int temp=sc.nextInt();
        int num=0;
        while(temp>0) {
            numbers[num]=temp%2;
            temp=(int)temp/2;
            num++;
        }
        num=0;
        int flag=0;
        for(int i=numbers.length;i>=0;i--) {
            if (numbers[i-1]!=0) {
                flag=i+1;
                break;
            }
        }
        for(int i=flag;i>=0;i--){
            System.out.print(numbers[i]);
        }
    }
}
