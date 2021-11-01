/**
 * @author 黄明权
 * @date
 * @description
 */
public class Test20 {
    public static void main(String[] args) {
        for (int i = 0; i <5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=15-2*(5-i);j<4*i+15;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<5+i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
