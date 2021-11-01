/**
 * @author 黄明权
 * @date
 * @description 请输入一个正整数年份，判断是否是闰年？在此基础上，随机生成一个int型二维数组
 * （最大为4位数），计算其中闰年的个数，并输出该年份
 */
public class Test4 {
    public static void main(String[] args) {
        int[] num=new int[100];
        for (int i=0; i<num.length; i++){
            num[i] =(int)(Math.random()*9000)+1000;
            if(num[i]%4==0){
                System.out.println(num[i]+"是闰年");
            }
        }

    }
}
