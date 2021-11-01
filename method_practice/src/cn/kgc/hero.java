package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class hero {

    String name;
    double att;
    double def;
    double hp;

    public hero(String n,double a,double d){
        this.name = n;
        this.att = a;
        this.def = d;

    }



    public  double attack(hero h1,hero h2){
        if(h1.att<h2.def){
            System.out.println("您的攻击力不足");
        }
        return h1.att-h2.def;
    }
    public double attack(hero h1,Solider s){
        if(h1.att<s.def){
            System.out.println("您的攻击力不足");
        }
        return h1.att-s.def;
    }
    public double attack(hero h1,monster m){
        if(h1.att<m.def){
            System.out.println("您的攻击力不足");
        }
        return h1.att-m.def;
    }
}
