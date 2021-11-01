/**
 * @author 黄明权
 * @date
 * @description 1、	冒泡排序法
 * 程序分析：01.外层循环N-1   （N：数的个数）
 * 	02.内层循环N-1-i (i:比较的轮数，外层循环的变量)
 * 	03.两两相比 小靠前！必须进行等量转换！互换位置！
 */
public class Test18 {
    public static void main(String[] args) {
        int temp;
        int[] num=new int[10];
        for (int i=0; i<10;i++) {
            num[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if(num[j]>num[i]) {
                    temp=num[j];
                    num[j]=num[i];
                    num[i]=temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]+"\t");
        }
    }
}
