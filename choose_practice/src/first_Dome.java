import java.util.Scanner;

/**
 * @author 黄明权
 * @date
 * @description 作业第一题练习（身高预测）
 */
public class first_Dome {
    public static void main(String[] args) {
        double faHeight;
        double moHeight;
        double chHeight = 0;
        double tempHeight;
        String sex;
        String sport_love;
        String eat_habit ;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入父亲身高：");
        faHeight=sc.nextDouble();
        System.out.println("请输入母亲身高：");
        moHeight=sc.nextDouble();
        System.out.println("请输入孩子性别：");
        sex=sc.next();
        System.out.println("请输入孩子是否喜欢运动（是或否）：");
        sport_love=sc.next();
        System.out.println("请输入孩子的饮食习惯（好和不好）：");
        eat_habit=sc.next();
        if(sex.equals("男")){
            tempHeight=(faHeight + moHeight) * 0.54;
            if(sport_love.equals("是") && eat_habit.equals("好")){
                chHeight=tempHeight*(1+0.035);
            }else if(sport_love.equals("否") && eat_habit.equals("好")){
                chHeight=tempHeight*(1+0.015);
            }else if(sport_love.equals("是") && eat_habit.equals("不好")){
                chHeight=tempHeight*(1+0.02);
            }
        }else if(sex.equals("女")){
            tempHeight=(faHeight * 0.923 + moHeight) / 2;
            if(sport_love.equals("是")&&eat_habit.equals("好")){
                chHeight=tempHeight*(1+0.035);
            }else if(sport_love.equals("否")&&eat_habit.equals("好")){
                chHeight=tempHeight*(1+0.015);
            }else if(sport_love.equals("是")&&eat_habit.equals("不好")) {
                chHeight = tempHeight * (1 + 0.02);
            }
        }else{
            System.out.println("性别输入错误");
        }
        System.out.println("您孩子的身高为："+chHeight);
    }
}
