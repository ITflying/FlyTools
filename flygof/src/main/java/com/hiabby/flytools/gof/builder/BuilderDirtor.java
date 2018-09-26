package com.hiabby.flytools.gof.builder;

/**
 * @desc
 * @date 2018/09/20
 **/
public class BuilderDirtor {
    GameRoleBuilder gameRoleBuilder = null;

    public void choiceSex(GameRoleBuilder gameRoleBuilder) {
        this.gameRoleBuilder = gameRoleBuilder;
    }

    public void createUser() {
        gameRoleBuilder.getBody();
        gameRoleBuilder.getHead();
        gameRoleBuilder.getLeg();
    }
}
