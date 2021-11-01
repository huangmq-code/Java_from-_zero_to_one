package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class attck {

    public static void main(String[] args) {

        hero h1=new hero("易大师",1500.0,500.0);
        hero h2=new hero("奥拉夫",1200,800);
        hero h3=new hero("艾琳",1800,300);
        monster m=new monster(1000,300);
        Solider s=new Solider(1100,350);
        h1.hp=3000;
        h2.hp=3000;
        h3.hp=2300;
        m.hp=2000;
        int temp1=0;
        int temp2=0;
        h1.hp-=h1.attack(h1,h2);
        System.out.println(h1.hp);
        m.hp-=h1.attack(h1,m);
        System.out.println(m.hp);
        s.hp-=h1.attack(h1,s);
        System.out.println(s.hp);
        h1.hp-=m.attack(m,h1);
        System.out.println(h1.hp);
        m.hp-=m.attack(m,m);
        System.out.println(m.hp);


    }
}
