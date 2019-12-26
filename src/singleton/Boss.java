package singleton;

public class Boss {
    private static Boss boss;
    private Boss(){}
    public static Boss getBoss(){
        if(boss==null){
            boss = new Boss();
        }
        return boss;
    }
}
