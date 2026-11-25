package 实验五美食烹饪大赛;

// 新增选手：李春雨，继承 People、实现 DoFood
public class LiChunYu extends People implements DoFood {

    public LiChunYu() {
        super();
    }

    public LiChunYu(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void makeFood(String name, String kind) {
        System.out.println("我是" + name + "我做的是" + kind);
    }

    @Override
    public void knife() {
        System.out.println("用炖的方式做菜");
    }
}
