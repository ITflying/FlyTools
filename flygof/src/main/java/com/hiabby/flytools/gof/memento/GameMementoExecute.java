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
        if (Objects.nonNull(gameInfo) && gameInfo.length() > 0) {
            System.out.println("存档：");
        }
        System.out.println("1");
    }

    public void quitGame() {
        System.out.println("2");
        gameInfo = userName + "info";
        saveTask();
        System.out.println("quit");
    }

    public void saveTask() {
        Originator originator = new Originator();
        num++;
        Memento memento = originator.createMemento(num, gameInfo);
        careTask.add(memento);
    }

    public void loadTask(int statusCode) {
        Memento memento = careTask.reback(statusCode);
        gameInfo = memento.getStatusInfo();
    }
}
