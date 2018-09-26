package com.hiabby.flytools.gof;

import com.hiabby.flytools.gof.template.StoreFreezedStockMethod;
import com.hiabby.flytools.gof.template.WarehouseFreezedMethod;
import org.junit.Test;

/**
 * @desc
 * @date 2018/09/20
 **/
public class TemplateTest {

    @Test
    public void test_freeze_stock_template() {
        String oreder = "2018/09/20";

        System.out.println("-- 门店： --");
        StoreFreezedStockMethod storeFreezedStockMethod = new StoreFreezedStockMethod();
        storeFreezedStockMethod.freeStock(oreder);

        System.out.println("\n-- 电子商城： --");
        WarehouseFreezedMethod warehouseFreezedMethod = new WarehouseFreezedMethod();
        warehouseFreezedMethod.freeStock(oreder);
    }
}
