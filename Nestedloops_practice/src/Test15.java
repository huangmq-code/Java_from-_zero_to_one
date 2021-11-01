/**
 * @author 黄明权
 * @date
 * @description  题目：打印出杨辉三角形（要求打印出10行如下图）
 * 程序分析：
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
public class Test15 {
    public static void main(String[] args) {
        int[][] num=new int[10][10];
        for(int i=0;i<10;i++){
            num[i][0]=1;
            num[i][i]=1;
        }
        for(int i=2;i<10;i++){
            for(int j=1;j<i;j++){
                num[i][j]=num[i-1][j-1]+num[i-1][j];
            }
        }

        for(int i=0;i<10;i++){
           for(int j=0;j<10;j++){
               if(num[i][j]!=0){
                   System.out.print(num[i][j]+" ");
               }
           }
            System.out.println();
        }
    }
}
