package com.yuewen.unite.demo.spring.boot.servant;

import com.qq.cloud.taf.common.annotation.*;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author jce2java
 */
@JceService
public interface LiveServant {

	public void isAlive(@JceHolder(name = "result") Holder<String> result);
}
