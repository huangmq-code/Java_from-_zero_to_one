/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic7 {
    public static void main(String[] args) {
        int sum=1;
        for(int i=2;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }else{
                sum-=i;
            }
        }
        System.out.println(" 1+2-3+4-5+6-7....+100的结果是："+sum);
    }
}
