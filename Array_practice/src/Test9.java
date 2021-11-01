import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 二分法查找数组中某一个元素
 */
public class Test9 {
    public static void main(String[] args) {
        int [] num = new int[16];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            num[i] =(int)(Math.random()*100);
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("请输入一个数字");
        int a=sc.nextInt();
        int start=0;
        int end=num.length-1;
        boolean flag=true;
        if(num[start]==a){
            System.out.println("您输入的元素在数组里找到了，在第一位");
        }
        while(start<end){
            int mid=(int)((start+end)/2);
            if(num[mid]==a){
                flag=false;
                System.out.println("您输入的元素在数组里找到了，在第"+mid+"位");
                break;
            }else if(num[mid]<a){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if (flag) {
            System.out.println("很遗憾没有在数组里找到");
        }
    }
}
