/**
 * @author 黄明权
 * @date
 * @description 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999的数，每个数分解出个位，十位，百位。
 */
public class Test2 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        for(int i=100;i<1000;i++){
            a=i/100;
            b=i/10-(a*10);
            c=i%10;
            if(i==(a*a*a+b*b*b+c*c*c)){
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
