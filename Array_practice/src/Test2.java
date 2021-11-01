/**
 * @author 黄明权
 * @date
 * @description 鸡兔同笼。鸡兔一共有50 只，脚一共有160 只，问鸡和兔各多少只?要求鸡兔至少一样一只
 */
public class Test2 {
    public static void main(String[] args) {
        String [] str=new String[1];
        int temp=0;
        for (int i = 1; i < 50; i++) {
            if((2*i+4*(50-i))==160){
                System.out.println("鸡有"+i+"只，兔子有"+(50-i)+"只");
                str[temp]="鸡有"+i+"只，兔子有"+(50-i)+"只";
                temp++;
            }

        }
        temp=0;
        for(String i:str){
            System.out.println(str[temp]);
            temp++;
        }
    }
}
