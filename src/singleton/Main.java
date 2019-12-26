package singleton;

public class Main {
    public static void main(String[] args) {
        Boss boss = Boss.getBoss();
        Boss boss1 = Boss.getBoss();
        System.out.println(boss);
        System.out.println(boss1);
    }
}
