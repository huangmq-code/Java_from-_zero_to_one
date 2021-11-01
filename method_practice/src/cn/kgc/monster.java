package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class monster {
   double att;
   double def;
   double hp;

   public monster(double a,double d){
      this.att = a;
      this.def = d;

   }
   public  double attack(monster m1,hero h1){
      if(m1.att<h1.def){
         System.out.println("您的攻击力不足");
      }
      return m1.att-h1.def;
   }
   public double attack(hero m1,Solider s){
      if(m1.att<s.def){
         System.out.println("您的攻击力不足");
      }
      return m1.att-s.def;
   }
   public double attack(monster m1,monster m2){
      if(m1.att<m2.def){
         System.out.println("您的攻击力不足");
      }
      return m1.att-m2.def;
   }
}
