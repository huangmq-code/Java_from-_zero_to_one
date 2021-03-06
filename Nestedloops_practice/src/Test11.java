/**
 * @author 黄明权
 * @date
 * @description 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 程序分析：请抓住分子与分母的变化规律。
 */
public class Test11 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=0;
        double sum=0.0;
        for (int i=0; i<20; i++) {
            c=a+b;
            sum+=b/a;
            a=b;
            b=c;
        }
        System.out.println("2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和为：" + sum);
    }
}
