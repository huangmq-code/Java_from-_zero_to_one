package cn.kgc;

/**
 * @author 黄明权
 * @date
 * @description
 */
public class solider {
    static String name ;
    static int att;
    static int def;
    static  int hp;
    public  int attack(hero h){
        if (att-h.def<0) {
            System.out.println( "攻击力不足");
            return -1;
        }
        return att-h.def;
    }
    public  int attack(solider s){
        if (att-s.def<0) {
            System.out.println( "攻击力不足");
            return -1;
        }
        return att-s.def;
    }
    public  int attack(monster m){
        if (att-m.def<0) {
            System.out.println( "攻击力不足");
            return -1;
        }
        return att-m.def;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        solider.name = name;
    }

    public static int getAtt() {
        return att;
    }

    public static void setAtt(int att) {
        solider.att = att;
    }

    public static int getDef() {
        return def;
    }

    public static void setDef(int def) {
        solider.def = def;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        solider.hp = hp;
    }
}
