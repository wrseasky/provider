package com.cn.hnust.dubbo;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;

/**
* @author 作者 wr:
* @version 创建时间：2018年4月11日 下午1:44:47
* 类说明
*/
@Service
public class MyGenericSercvice implements GenericService{

	@Override
	public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
		if("all".equals(method)){
			return "all"  + "==" + args[0];
		}else if("other".equals(method)){
			return "other" + "==" + args[1];
		}
		return null;
	}

}
