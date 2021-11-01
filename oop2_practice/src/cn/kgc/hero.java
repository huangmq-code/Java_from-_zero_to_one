package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class hero {
    static String name ;
    static int att;
    static int def;
    static int hp;

    public  int attack(hero h){
        if (att-cn.kgc.hero.def<0) {
           System.out.println( "攻击力不足");
           return -1;
        }
        return att- def;
    }
    public  int attack(solider s){
        if (att- solider.def <0) {
            System.out.println( "攻击力不足");
            return -1;
        }
        return att- solider.def;
    }
    public  int attack(monster m){
        if (att- monster.def <0) {
            System.out.println( "攻击力不足");
            return -1;
        }
        return att- monster.def;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        hero.name = name;
    }

    public static int getAtt() {
        return att;
    }

    public static void setAtt(int att) {
        hero.att = att;
    }

    public static int getDef() {
        return def;
    }

    public static void setDef(int def) {
        hero.def = def;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        hero.hp = hp;
    }
}
