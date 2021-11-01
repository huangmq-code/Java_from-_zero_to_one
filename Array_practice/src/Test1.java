/**
 * @author 黄明权
 * @date
 * @description 百钱买百鸡，有100元钱，要去买100只鸡，公鸡5元一只，
 * 母鸡3元一只，小鸡1元3只，问公，母，小鸡各买多少只
 */
public class Test1 {
    public static void main(String[] args) {
        String [] str=new String[4];
        int temp=0;
       for (int i = 0; i <20;i++){
           for (int j = 0; j <33;j++){
              int k=100-i-j;
             if(15*i+9*j+k==300){
                    System.out.println("公鸡有"+i+"只，母鸡有"+j+"只，小鸡有"+k+"只");
                    str[temp]="公鸡有"+i+"只，母鸡有"+j+"只，小鸡有"+k+"只";
                   temp++;
               }
            }
        }



         temp=0;
        for(String i:str){
            System.out.println(str[temp]);
            temp++;
        }

    }
}
