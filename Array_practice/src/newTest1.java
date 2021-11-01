/**
 * @author 黄明权
 * @date
 * @description 百钱买百鸡，有100元钱，要去买100只鸡，公鸡5元一只，
 *  母鸡3元一只，小鸡1元3只，问公，母，小鸡各买多少只
 */
public class newTest1 {
    public static void main(String[] args) {
        for (int x = 0; x < 15; x++) {
            int y = (100 - 7 * x) % 4;
            int z = (300 + 3 * x) % 4;
            if (y == 0 && z == 0) {
                int hen = (100 - 7 * x) / 4;
                int chi = (300 + 3 * x) / 4;
                System.out.println("公鸡：" + x + "只, 母鸡：" + hen
                        + "只, 小鸡：" + chi + "只");
            }
        }

    }
}
