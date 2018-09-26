package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.builder.*;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/20
 **/
public class BuilderTest {

    @Test
    public void test_builder() {
        BuilderDirtor builderDirtor = new BuilderDirtor();

        // 创建男性角色
        GameRoleBuilder manRoleBuilder = new ManRoleBuilder();
        builderDirtor.choiceSex(manRoleBuilder);
        builderDirtor.createUser();
        GameRole manRole = manRoleBuilder.getGameRole();
        System.out.println("展示：" + manRole.getHead() + " " + manRole.getBody() + " " + manRole.getLeg() + "\n");

        // 创建女性角色
        GameRoleBuilder womanRoleBuilder = new WomanRoleBuilder();
        builderDirtor.choiceSex(womanRoleBuilder);
        builderDirtor.createUser();
        GameRole womanRole = womanRoleBuilder.getGameRole();
        System.out.println("展示：" + womanRole.getHead() + " " + womanRole.getBody() + " " + womanRole.getLeg() + "\n");
    }
}
