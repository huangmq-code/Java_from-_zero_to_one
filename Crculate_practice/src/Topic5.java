/**
 * @author 黄明权
 * @date
 * @description
 */
public class Topic5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=1000;i++){
            if(i%7==0){
                continue;
            }
            sum+=i;
        }
        System.out.println("1000以内所有不能被7整除的整数之和"+sum);
    }
}
