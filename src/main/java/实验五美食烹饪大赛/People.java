package 实验五美食烹饪大赛;

abstract public class People {
    private String name; // 姓名
    private String kind; // 拿手菜

    public People(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public People() {
    }

    // 抽象方法：展示烹饪方式
    public abstract void knife();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
