package com.hiabby.flytools.gof.template;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

/**
 * @desc 模版方法模式 - 定义一个流程， 然后将具体的分支实现下放到子类当中完成，实现多流程处理
 * @date 2018/09/20
 **/
public abstract class FreezedStockTemplate {
    // region 依赖

    private static final Logger LOGGER = LoggerFactory.getLogger(FreezedStockTemplate.class);

    // endregion

    /**
     * 冻结库存
     *
     * @param order
     */
    public final void freeStock(String order) {
        // 1、校验参数
        boolean referenceType = this.checkFreezeStock(order);
        if (Objects.nonNull(referenceType)) {
            // 2、加锁
            this.lock();

            // 3、获取库存
            this.getStocks(order);

            // 4、循环遍历库存，构造库存操作实体和历史记录
            List<Integer> stockIds = this.initFreezedStockEntities(order);

            // 5、发送队列消息
            this.sendModifyTopic(stockIds);
        }
    }

    boolean checkFreezeStock(String order) {
        System.out.println("校验冻结库存参数是否符合要求");
        return true;
    }

    void lock() {
        System.out.println("加锁");
    }

    void getStocks(String order) {
        System.out.println("获取库存");
    }

    abstract List<Integer> initFreezedStockEntities(String order);

    void sendModifyTopic(List<Integer> stockIds) {
        // 发送库存变更通知
        if (org.apache.commons.collections.CollectionUtils.isNotEmpty(stockIds)) {
            System.out.println("发送通知");
        }
    }
}
