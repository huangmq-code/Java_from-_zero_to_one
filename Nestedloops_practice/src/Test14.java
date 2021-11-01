/**
 * @author 黄明权
 * @date
 * @description 对10个数进行排序
 */
public class Test14 {
    public static void main(String[] args) {
        int[] num=new int[10];
        for (int i = 0; i <10;i++){
            num[i] =(int) (Math.random()*100);
        }
        for (int i = 0; i <10;i++){
            for (int j = i; j <10;j++){
                if(num[i] <num[j]) {
                    num[i]=num[i]+num[j];
                    num[j]=num[i]-num[j];
                    num[i]=num[i]-num[j];
                }
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.print (num[i]+" ");
        }
    }
}
