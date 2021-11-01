/**
 * @author 黄明权
 * @date
 * @description 用*打印出菱形：在上午的三角形基础上打印
 * 程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，
 * 利用双重 for循环，第一层控制行，第二层控制列。
 */
public class Test10 {
    public static void main(String[] args) {
        for(int j = 1; j <= 3; j++) {
            for(int k = 1; k<4-j;k++){
                System.out.print("  ");
            }
            for(int i=0;i<2*j-1;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j = 1; j <= 2; j++) {
            for(int k = 0; k<j;k++){
                System.out.print("  ");
            }
            for(int i=0;i<5-2*j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
