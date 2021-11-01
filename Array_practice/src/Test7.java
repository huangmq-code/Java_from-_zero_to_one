/**
 * @author 黄明权
 * @date
 * @description  、有一组数，其排列形式如下：11，19，9，12，5，20，1，18，4，16，6，10，15，2，
 * 17，3，14，7，13，8，且尾部8 和头部11 首尾相连，构成环形的一组数，编程找出（连
 * 续）相邻的4 个数，其相加之和最大，并给出它们的起始位置下标。
 */
public class Test7 {
    public static void main(String[] args) {
        int [] num = {11,19,9,12,5,20,1,18,4,16,6,10,15,2, 17,3,14,7,13,8};
        int max=0;
        int temp=0;
        for(int i=0;i< num.length;i++){
             int j=i+4;
            if(i+4>num.length){
                 j=i+3- num.length;
            }
            if(j==0){
                temp=num[0]+num[i]+num[i+1]+num[i+2];
                if(temp>max)
                    max=temp;
                continue;
            }
            if(j==1){
                temp=num[0]+num[i]+num[i+1]+num[1];
                if(temp>max)
                    max=temp;
                continue;
            }
            if(j==2){
                temp=num[0]+num[i]+num[2]+num[1];
                if(temp>max)
                    max=temp;
                continue;
            }
            temp=num[i]+num[i+1]+num[i+2]+num[i+3];
            if(temp>max) {
                max=temp;
            }
        }
        System.out.println("最大和数为："+max);
    }
}
