/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic8 {
    public static void main(String[] args) {
        double i=0.08;
        int count=0;
        while(i<8848130){
            count++;
            i*=2;
        }
        System.out.println("对折"+count+"次之后能达到或超过珠穆朗玛峰的高度");
    }
}
