/**
 * @author 黄明权
 * @date
 * @description 7、	题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
 */
public class Test7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <=4;i++){
            for (int j = 1; j <=4;j++){
                if(i==j){
                    continue;
                }
                for (int k = 1; k <=4;k++){
                    if(i==k||j==k){
                        continue;
                    }
                    count++;
                }
            }
        }
        System.out.println("一共有" + count + "种组合");
    }
}
