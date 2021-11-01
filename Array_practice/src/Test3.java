/**
 * @author 黄明权
 * @date
 * @description  公鸡2文，母鸡1文，小鸡半文，每种至少一只，100文买100只鸡有多少种可能
 */
public class Test3 {
    public static void main(String[] args) {
        int temp = 0;
        int sum=0;
        String [] str=new String[33];
        for (int i = 0; i <50;i++){
            for (int j = 0; j <(100-2*i);j++){
                int k=100-i-j;
                if((4*i+2*j+k)==200){
                    sum++;
                    System.out.println("公鸡有"+i+"只，母鸡有"+j+"只，小鸡有"+k+"只");
                    str[temp]="公鸡有"+i+"只，母鸡有"+j+"只，小鸡有"+k+"只";
                    temp++;
                }
            }
        }
        System.out.println(sum);
        temp=0;
        for(String i:str){
            System.out.println(str[temp]);
            temp++;
        }
    }
}
