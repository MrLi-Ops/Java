package 狼人杀;

import java.util.Scanner;

public class WerewolfGame {
    //预言家行为逻辑
    public static void seerCheck(String[] roles, boolean[] isAlive, int numPlayers, Scanner scanner) {
        int seerIndex = -1;
        for (int i = 0; i < numPlayers; i++) {
            if (roles[i].equals("预言家")) {
                seerIndex = i;
                break;
            }
        }
        if (seerIndex == -1 || !isAlive[seerIndex]) {
            return;
        }
        System.out.println("预言家 " + seerIndex + " 请查验一名玩家的身份（输入要查验的玩家编号）：");
        int checkTarget = scanner.nextInt();
        if (checkTarget < 0 || checkTarget >= numPlayers) {
            System.out.println("该玩家不存在");
        } else if (checkTarget == seerIndex) {
            System.out.println("不能查验自己");
        } else if (roles[checkTarget].equals("邪恶的李春雨")) {
            System.out.println("查验结果：玩家 " + checkTarget + " 是邪恶的李春雨！");
        } else {
            System.out.println("查验结果：玩家 " + checkTarget + " 是好人。");
        }
    }
    //猎人行为逻辑
    public static void hunterShoot(int deadPlayer, String[] roles, boolean[] isAlive, Scanner scanner) {
        if (!roles[deadPlayer].equals("猎人")) {
            return;
        }
        System.out.println("猎人 " + deadPlayer + " 是猎人，发动开枪技能！请输入要带走的玩家编号（输入 -1 表示放弃）：");
        int shootTarget = scanner.nextInt();
        if (shootTarget == -1) {
            System.out.println("猎人选择放弃开枪。");
        } else if (!isAlive[shootTarget]) {
            System.out.println("目标无效或已死亡，猎人未能带走玩家。");
        } else {
            isAlive[shootTarget] = false;
            System.out.println("猎人开枪带走了玩家 " + shootTarget + "。");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到狼人杀游戏！");
        //定义游戏角色数组
        String[] roles = {"邪恶的李春雨","邪恶的李春雨","平民","平民","平民","猎人","预言家"};
        int numPlayers = roles.length;
        boolean[] isAlive = new boolean[numPlayers];
        //初始化状态
        for(int i = 0; i < numPlayers; i++){
            isAlive[i] = true;
        }
        //游戏开始
        boolean gameOver = false;
        while (!gameOver){
            //显示当前状态
            System.out.println("\n存活当前玩家:");
            for (int i = 0; i < numPlayers; i++){
                if(isAlive[i]){
                    System.out.println(i + ":"+roles[i]);
                }

            }
            //预言家先查验，狼人再行动
            seerCheck(roles, isAlive, numPlayers, scanner);

            //狼人行动
            System.out.println("\n邪恶的李春雨请行动（输入要杀死的玩家编号）：");
            int wolfTarget = scanner.nextInt();
            if(roles[wolfTarget].equals("邪恶的李春雨")){
                System.out.println("不能杀死自己！");
            }else{
                isAlive[wolfTarget] = false;
                System.out.println("玩家"+wolfTarget+"已被杀死");
                hunterShoot(wolfTarget, roles, isAlive,  scanner);
            }
            //判断游戏是否结束
            int numWolves = 0;
            int numVillagers = 0;
            for(int i = 0; i < numPlayers; i++){
                if (isAlive[i]){
                    if (roles[i].equals("邪恶的李春雨")){
                        numWolves++;
                    } else {
                        numVillagers++;
                    }
                }
            }
            if(numWolves > numVillagers){
                System.out.println("\n邪恶的李春雨胜利！");
                gameOver = true;
            }else if(numWolves == 0){
                System.out.println("\n村民胜利!");
                gameOver = true;
            }
            //平民行动
            if (!gameOver) {
                System.out.println("\n 天亮了，请发言并投票（输入要投票的玩家编号）：");
                int voteTarget = scanner.nextInt();
                if (!isAlive[voteTarget]) {
                    System.out.println("该玩家已经死亡或不存在！");
                } else {
                    isAlive[voteTarget] = false;
                    System.out.println("玩家 " + voteTarget + " 已被投票出局。");
                    hunterShoot(voteTarget, roles, isAlive,  scanner);
                }
                // 判断游戏是否结束
                numWolves = 0;
                numVillagers = 0;
                for (int i = 0; i < numPlayers; i++) {
                    if (isAlive[i]) {
                        if (roles[i].equals("邪恶的李春雨")) {
                            numWolves++;
                        } else {
                            numVillagers++;
                        }
                    }
                }
                if (numWolves >= numVillagers) {
                    System.out.println("\n 邪恶的李春雨胜利！");
                    gameOver = true;
                } else if (numWolves == 0) {

                    System.out.println("\n 村民胜利！");
                    gameOver = true;
                }
            }
        }
        System.out.println("\n 游戏结束。再见！");
    }
}
















