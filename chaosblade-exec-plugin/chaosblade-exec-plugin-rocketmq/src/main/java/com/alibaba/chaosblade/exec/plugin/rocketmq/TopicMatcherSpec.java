package com.alibaba.chaosblade.exec.plugin.rocketmq;

import com.alibaba.chaosblade.exec.common.model.matcher.BasePredicateMatcherSpec;

/**
 * @author haibin
 * @date 2019-07-24
 * @email haibin.lhb@alibaba-inc.com
 */
public class TopicMatcherSpec extends BasePredicateMatcherSpec implements RocketMqConstant {

    @Override
    public String getName() {
        return FLAG_NAME_TOPIC;
    }

    @Override
    public String getDesc() {
        return "Message topic";
    }

    @Override
    public boolean noArgs() {
        return false;
    }

    @Override
    public boolean required() {
        return true;
    }
}
