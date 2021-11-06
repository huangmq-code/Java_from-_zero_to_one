package Test3;
/**
 * @author 黄明权
 * @date
 * @description
 */
public class Test {
    Test(Common h){
        equipment c=new equipment(100,50,300);

        c.addatt(h);
        c.adddef(h);
        c.addhp(h);
    }
    public static void main(String[] args) {
        Common h=new Hero("易大师",100,45,1000);
        Common h1=new Hero("奥拉夫",120,35,1000);
        int temp=(int)(Math.random()*10);

        Test t=new Test(h);
        System.out.println("经过装备加持"+h.name+"的攻击力为"+h.att+",防御力为"+h.def+",生命力为"+h.hp);
        while(h.hp>0&&h1.hp>0){
            if(temp%2==0){
                h.attack(h1);
            }else{
                h1.attack(h);
            }
        }
    }
}
