package 实验五美食烹饪大赛;

public class ZhangSan extends People implements DoFood {
    public ZhangSan() {
        super();
    }

    public ZhangSan(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void knife() {
        System.out.println("用蒸的方式做菜");
    }

    @Override
    public void makeFood(String name, String kind) {
        System.out.println("我是" + name + "我做的是" + kind);
    }
}
