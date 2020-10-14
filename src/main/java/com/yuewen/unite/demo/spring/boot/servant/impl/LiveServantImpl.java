package com.yuewen.unite.demo.spring.boot.servant.impl;

import com.qq.cloud.taf.common.support.Holder;
import com.qq.cloud.taf.spring.annotation.TafService;
import com.yuewen.unite.demo.spring.boot.servant.LiveServant;

@TafService("TafDemoServiceSpringBootObj")
public class LiveServantImpl implements LiveServant {
    @Override
    public void isAlive(Holder<String> result) {
        result.setValue("success");
    }
}
