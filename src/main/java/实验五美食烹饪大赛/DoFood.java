package 实验五美食烹饪大赛;

import java.util.ArrayList;
import java.util.List;

public interface DoFood {
    // 做饭过程
    void makeFood(String name, String kind);

    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();
        LiChunYu liChunYu = new LiChunYu();

        System.out.println("-------比赛开始");
        zhangSan.makeFood("张三", "鱼肉");
        zhangSan.knife();
        System.out.println("==========><===========");
        liSi.makeFood("李四", "猪肉");
        liSi.knife();
        System.out.println("==========><===========");
        liChunYu.makeFood("李春雨", "排骨汤");
        liChunYu.knife();
        System.out.println("比赛结束，评委投票");

        List<String> vote = new ArrayList<>();
        vote.add("张三");
        vote.add("李四");
        vote.add("李春雨");
        vote.add("李春雨");
        vote.add("李春雨");
        // Lambda / 方法引用：逐条输出投票
        vote.stream().forEach(System.out::println);

        System.out.println(">李春雨胜");
    }
}
