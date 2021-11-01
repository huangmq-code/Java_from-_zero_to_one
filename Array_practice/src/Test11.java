import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 请输入班级人数，然后输入每个人的语文数学和英语成绩，并且打印出语文的两个最高
 * 分，数学的两个最低分。和英语的平均分（使用二维数组）
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入班级人数");
        int num=sc.nextInt();
        int[][] scores=new int[3][num];
        int sum=0;
        for (int i=0; i<3;i++){
            if(i==0){
                System.out.println("请输入语文成绩");
            }else if(i==1){
                System.out.println("请输入数学成绩");
            }else{
                System.out.println("请输入英语成绩");
            }
            for(int j=0;j<scores[i].length;j++){
                scores[i][j]=sc.nextInt();
                if(i==2){
                    sum+=scores[i][j];
                }
            }
            Arrays.sort(scores[i]);
        }
        System.out.println("语文的两个最低分为："+scores[0][0]+"和"+scores[0][1]);
        System.out.println("数学的两个最低分为："+scores[1][0]+"和"+scores[1][1]);
        System.out.println("英语平均分为:"+sum/num);
    }
}
