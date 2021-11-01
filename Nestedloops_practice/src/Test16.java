/**
 * @author 黄明权
 * @date
 * @description 求0—7所能组成的奇数个数。
 */
public class Test16 {
    public static void main(String[] args) {
        int count = 0;
        int[] num=new int[8];
        int temp=0;
        boolean flag = false;
        for(int i=0;i<7654321;i++){
            int n=0;
            temp=num[n]=i%10;
            if(temp%2==0){
                continue;            }
            while(temp>10){
                n++;
                temp=temp%10;
                num[n]=temp;
                if(num[n]>8){
                    flag=true;
                }
            }
            for(int j=0;j<8;j++){
                for(int k=j;k<8;k++){
                    if(num[j]==num[k]){
                        flag=true;
                    }
                }
            }
            if(flag==true){
                continue;
            }
            count++;
        }
        System.out.println("0—7所能组成的奇数个数。"+count);
    }
}
