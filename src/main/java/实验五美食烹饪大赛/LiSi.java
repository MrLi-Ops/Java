package 实验五美食烹饪大赛;

public class LiSi extends People implements DoFood {
    public LiSi(String name, String kind) {
        super(name, kind);
    }

    public LiSi() {
    }

    @Override
    public void makeFood(String name, String kind) {
        System.out.println("我是" + name + "我做的是" + kind);
    }

    @Override
    public void knife() {
        System.out.println("用炒的方式做菜");
    }
}
