/**
 * @author 黄明权
 * @date
 * @description
 */
public class attack {
    public static void main(String[] args) {
        Hero h1=new Hero("易大师",100,45,1000);
        Hero h2=new Hero("奥拉夫",120,35,1000);
        int temp=(int)(Math.random()*10);
        while(h1.hp>0&&h2.hp>0){
            if(temp%2==0){
                h1.attack(h2);
            }else{
                h2.attack(h1);
            }
        }
    }
}
