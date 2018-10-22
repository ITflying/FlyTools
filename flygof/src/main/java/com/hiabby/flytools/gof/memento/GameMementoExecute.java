package com.hiabby.flytools.gof.memento;

import java.util.Objects;

/**
 * @desc 备忘录
 * @date 2018/09/28
 **/
public class GameMementoExecute {
    int num = 0;
    CareTask careTask;
    private String userName;
    private String gameInfo;

    public GameMementoExecute(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // todo:详细描述注释
    public void runGame() {
        if (Objects.nonNull(gameInfo)) {
            System.out.println("游戏信息为：" + gameInfo);
        }
        System.out.println("快乐游戏中");
    }

    public void quitGame() {
        gameInfo = userName + ":info" + (int) (1 + Math.random() * (1000));
        saveTask();
        System.out.println("退出游戏！\n");
    }

    public void saveTask() {
        num++;
        System.out.println("存档中：存档序号为" + num + "，游戏信息为（" + gameInfo + ")");
        Originator originator = new Originator();
        Memento memento = originator.createMemento(num, gameInfo);
        if (Objects.isNull(careTask)) {
            careTask = new CareTask();
        }
        careTask.add(memento);
    }

    public void loadTask(int statusCode) {
        System.out.println("载入存档：" + statusCode);
        Memento memento = careTask.reback(statusCode - 1);
        gameInfo = memento.getStatusInfo();
    }
}
