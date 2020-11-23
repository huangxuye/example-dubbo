package com.wxuy.dubbo.provider.providerservice.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component //尽量不要用@Service 因为使用dubbo的时候 @Service有两个包 一个是spring 一个是dubbo 容易用错
@Service
public class ProviderServiceImpl implements ProviderService{
	@Override
	public String providerService() {
		return "Dubbo测试:Provider-service 返回";
	}
}
