/**
 * @author 黄明权
 * @date
 * @description 5、	题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 * 例如6=1＋2＋3.编程找出1000以内的所有完数
 */
public class Test5 {
    public static void main(String[] args) {
        double temp = 0;
        double i;
        for (i = 1; i <1000;i++){
            for (int j = 1; j <i;j++){
                if(i%j==0){
                    temp += j;
                }
            }
            if(i==temp){
                System.out.println(i + "是完数");
            }
        }
    }
}
