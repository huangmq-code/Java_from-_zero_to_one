/**
 * @author 黄明权
 * @date
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Common h=new Hero("易大师",100,45,1000);
        Common h1=new Hero("奥拉夫",120,35,1000);
        int temp=(int)(Math.random()*10);
        while(h.hp>0&&h1.hp>0){
            if(temp%2==0){
                h.attack(h1);
            }else{
                h1.attack(h);
            }
        }
    }
}
