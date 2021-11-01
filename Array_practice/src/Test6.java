import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 一个任意的四位正整数。将数字重新组合成一个最大的数和最小的数相减，重复这个
 * 过程，最多七步，必得6174。即：7641-1467=6174。将永远出不来。求证：所有四位数数
 * 字（全相同的除外），均能得到6174。输出掉进黑洞的步数
 */
public class Test6 {
    public static void main(String[] args) {
        int count =0;
        int max=0;
        int min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int[] num=new int[4];
        int temp= sc.nextInt();
        while(temp!=6174){
            for(int i=0;i< num.length;i++){
                num[i]=temp%10;
                temp/=10;
            }
            for(int i=0;i< num.length;i++){
                for(int j=0;j<i;j++){
                    if(num[i]<num[j]){
                        num[i]=num[i]+num[j];
                        num[j]=num[i]-num[j];
                        num[i]=num[i]-num[j];
                    }
                }
            }
            max=num[0]+num[1]*10+num[2]*100+num[3]*1000;
            min=num[3]+num[2]*10+num[1]*100+num[0]*1000;
            temp=max-min;
            count++;
        }
        System.out.println("循环"+count+"次进入黑洞");
    }
}
