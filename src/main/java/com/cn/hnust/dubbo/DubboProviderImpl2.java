package com.cn.hnust.dubbo;

import org.springframework.stereotype.Service;

/**
 * @author 作者 wr:
 * @version 创建时间：2018年4月11日 上午10:38:09 类说明
 */
@Service
public class DubboProviderImpl2 implements DubboProviderService {

	@Override
	public String dubbo() {
		return this.getClass().getName() ;
	}

}
