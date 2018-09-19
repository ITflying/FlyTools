package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.factory.AbstractFatory.AFactory;
import com.hiabby.flytools.gof.factory.AbstractFatory.OrderFactory;
import com.hiabby.flytools.gof.factory.AbstractFatory.ReceivedFactory;
import com.hiabby.flytools.gof.factory.AnnotationEasyFactory.AnnotationFactory;
import com.hiabby.flytools.gof.factory.commonfactory.CommonFactory;
import com.hiabby.flytools.gof.factory.entity.OrderType;
import com.hiabby.flytools.gof.factory.simplefactory.SimpleFactory;
import org.junit.Test;

public class FactoryTest {
    // region 依赖


    // endregion

    // region 模式实现
    @Test
    public void test_run_abstract_factory() {
        AFactory aFactory = new OrderFactory();
        aFactory.executeOpeart();
        aFactory.changeDB();

        aFactory = new ReceivedFactory();
        aFactory.executeOpeart();
        aFactory.changeDB();
    }

    @Test
    public void test_run_annotation_easy_factory() {
        String tag = OrderType.ORDER.getValue();
        AnnotationFactory.executeOpeartoryByTag(tag);

        tag = OrderType.RECEIVED.getValue();
        AnnotationFactory.executeOpeartoryByTag(tag);
    }

    @Test
    public void test_run_common_factory() {
        CommonFactory factory = new com.hiabby.flytools.gof.factory.commonfactory.OrderFactory();
        factory.executeOpeart();

        factory = new com.hiabby.flytools.gof.factory.commonfactory.ReceivedFactory();
        factory.executeOpeart();
    }

    @Test
    public void test_run_simple_factory() {
        String tag = OrderType.ORDER.getValue();
        SimpleFactory.executeOpeartoryByTag(tag);

        tag = OrderType.RECEIVED.getValue();
        SimpleFactory.executeOpeartoryByTag(tag);
    }

    // endregion
}
