package com.binay.api.configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutorConfiguration {
	
	public ExecutorService threadPoolTaskExecutor( ) {
		ExecutorService executorService = Executors.newWorkStealingPool();
		return executorService;
	}
}
