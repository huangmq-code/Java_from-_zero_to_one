/**
 * @author 黄明权
 * @date
 * @description 6、	题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 *      再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高
 */
public class Test6 {
    public static void main(String[] args) {
        double height=100.0;
        double road=0;
        for (int i=0; i<10; i++) {
            road+=height;
            height=height/2;
            road+=height;
        }
        System.out.println("球在下降过程中经过" + road + "米");
    }
}
