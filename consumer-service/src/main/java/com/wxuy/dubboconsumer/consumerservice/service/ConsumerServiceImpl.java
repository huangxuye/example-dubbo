package com.wxuy.dubboconsumer.consumerservice.service;

import com.wxuy.dubbo.provider.providerservice.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
	@Reference
	private ProviderService providerService;

	@Override
	public String consumerService() {
		return providerService.providerService();
	}
}
