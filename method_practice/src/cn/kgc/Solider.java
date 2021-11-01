package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class Solider {
    double att;
    double def;
    double hp;

    public Solider(double a,double d){
        this.att = a;
        this.def = d;
    }
    public  double attack(Solider s,hero h1){
        if(s.att<h1.def){
            System.out.println("您的攻击力不足");
        }
        return s.att-h1.def;
    }
    public double attack(Solider s1,Solider s2){
        if(s1.att<s2.def){
            System.out.println("您的攻击力不足");
        }
        return s1.att-s2.def;
    }
    public double attack(Solider s,monster m){
        if(s.att<m.def){
            System.out.println("您的攻击力不足");
        }
        return s.att-m.def;
    }
}

