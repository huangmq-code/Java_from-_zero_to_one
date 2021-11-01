/**
 * @author 黄明权
 * @date
 * @description 9、	题目：一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内判断，另外由这个数的开方数自乘得到平方数，进行比较
 */
public class test9 {
    public static void main(String[] args) {
        for (int i = 0; i <100000;i++){
            int a=i+100;
            int b=i+168;
            int temp1=(int)Math.sqrt(a);
            int temp2=(int)Math.sqrt(b);
            if(((temp1*temp1)==a)&&((temp2*temp2)==b)){
                System.out.println("这个数是"+i);
            }
        }
    }
}
