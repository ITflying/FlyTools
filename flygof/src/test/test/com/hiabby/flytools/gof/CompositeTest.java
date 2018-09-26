package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.composite.opencomposite.*;
import com.hiabby.flytools.gof.composite.safecomposite.SafeComponent;
import com.hiabby.flytools.gof.composite.safecomposite.SafeCompositeLeaf;
import com.hiabby.flytools.gof.composite.safecomposite.SafeCompositeRoot;
import org.junit.Test;

/**
 * @desc 透明式
 * @date 2018/09/25
 **/
public class CompositeTest {

    @Test
    public void test_open_composite(){
        OpenComponent boss = new OpenCreateComposite("boss");
        OpenComponent administrativeGroup = new OpenLeaf("administrativeGroup");
        OpenComponent developmentGroup = new OpenDevComposite("developmentGroup");
        OpenComponent developmentEmployee1 = new OpenDevLeaf("xiaoMing");
        OpenComponent developmentEmployee2 = new OpenDevLeaf("xiaoHong");
        OpenComponent testGroup = new OpenLeaf("testGroup");


        developmentGroup.add(developmentEmployee1);
        developmentGroup.add(developmentEmployee2);

        boss.add(administrativeGroup);
        boss.add(developmentGroup);
        boss.add(testGroup);

        boss.print();
    }

    @Test
    public void test_safe_composite(){
        SafeCompositeRoot boss = new SafeCompositeRoot("boss");
        SafeComponent administrativeGroup = new SafeCompositeLeaf("administrativeGroup");
        SafeCompositeRoot developmentGroup = new SafeCompositeRoot("developmentGroup");
        SafeComponent developmentEmployee1 = new SafeCompositeLeaf("xiaoMing");
        SafeComponent developmentEmployee2 = new SafeCompositeLeaf("xiaoHong");
        SafeComponent testGroup = new SafeCompositeLeaf("testGroup");


        developmentGroup.add(developmentEmployee1);
        developmentGroup.add(developmentEmployee2);

        boss.add(administrativeGroup);
        boss.add(developmentGroup);
        boss.add(testGroup);

        boss.show(1);
    }
}
