package Test2;

public class  computer implements CPU, Disk{
//    String brand="AMD";
//    double frequency=14.5;
//    int count=500;
    String brand;
    double frequency;
    int count;
    int count2;

    public computer(String brand, double frequency, int count, int count2) {
        this.brand = brand;
        this.frequency = frequency;
        this.count = count;
        this.count2 = count2;
    }

    void show(){
        System.out.println("CPU的型号是"+brand+",CPU的主频是："+frequency+"MHz");
        System.out.println("磁盘容量为"+count+"GB");
        System.out.println("内存为"+count2+"GB");
    }
}
