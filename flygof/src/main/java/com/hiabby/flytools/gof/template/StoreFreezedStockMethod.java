package com.hiabby.flytools.gof.template;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @desc
 * @date 2018/09/20
 **/
public class StoreFreezedStockMethod extends FreezedStockTemplate {
    // region

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreFreezedStockMethod.class);

    // endregion

    @Override
    List<Integer> initFreezedStockEntities(String order) {
        List<Integer> stockIds = Lists.newArrayList();
        System.out.println("门店处理冻结库存");
        return stockIds;
    }
}
