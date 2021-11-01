import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class secend_Dome {
    public static void main(String[] args) {
        double init_price = 26.5;
        double pay_money=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入购买的课本数量：");
        int book_count=sc.nextInt();
        if (book_count>500){
            pay_money=(init_price*book_count)*0.8-1000;
        }else if (book_count>100){
            pay_money=(init_price*book_count)*0.9;
        }else{
            pay_money=init_price*book_count;
        }
        System.out.println("您需要支付："+pay_money+"元");
    }
}

