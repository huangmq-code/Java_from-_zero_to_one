import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 8、	题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，
 * 奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，
 * 可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，
 * 可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
 * 超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入利润（万）");
        double i=sc.nextDouble();
        double need_pay;
        if(i>100){
            need_pay=1+0.75+1+0.6+0.6+(i-100)*0.01;
        }else if(i>60){
            need_pay=1+0.75+1+0.6+(i-60)*0.015;
        }else if(i>40){
            need_pay=1+0.75+1+(i-40)*0.03;
        }else if(i>20){
            need_pay=1+0.75+(i-20)*0.05;
        }else if(i>10){
            need_pay=1+(i-10)*0.075;
        }else{
            need_pay=i*0.1;
        }
        System.out.println("该发奖金应为：" + need_pay+"万元");
    }
}


