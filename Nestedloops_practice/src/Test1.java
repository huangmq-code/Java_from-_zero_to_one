/**
 * @author 黄明权
 * @date
 * @description  判断2-100之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到 (这个数)表明，如果能被整除，则此数不是素数，反之是素数。
 */
public class Test1 {
    public static void main(String[] args) {
        int j=0;
        for (int i = 2; i <= 100; i++) {
            for(j=2;j<i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i==j){
                System.out.println(i+"是素数");
            }
        }
    }
}
