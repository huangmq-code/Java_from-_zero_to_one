import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 随机生成一个short 型一维数组，从控制台输入一个数值，遍历数组查找，如果找到了，
 * 打印出该数在数组中的位置，如果没有查到，请将该数值插入并形成新的数组（要求降序）
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        short temp= scanner.nextShort();
        short[] num=new short[10];
        short[] num1=new short[num.length+1];
        for (int i=0; i<num.length;i++){
            num[i]=(short)(Math.random()*100);
            if(temp==num[i])
                System.out.println("找到了，在"+i+"位");
        }
        short  temp1=0;
        num1[0]=temp1;
        for(int i=1;i< num1.length;i++){
            num1[i]=num[i-1];
        }
        for(int j=1;j< num1.length;j++){
            for(int k=1;k<j;k++){
                if(num1[j]<num1[k]){
                    temp1=num1[k];
                    num1[k]=num1[j];
                    num1[j]=temp1;
                }
            }
        }
        temp=0;
        for(short i:num1){
            System.out.println(num1[temp]);
            temp++;
        }
    }
}
