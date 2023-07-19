package com.study.redispubsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class RedisPubSubApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RedisPubSubApplication.class, args);
		StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
		String val = template.opsForValue().get("key1");
		System.out.println(val);

		val = template.opsForValue().get("key2");
		System.out.println(val);
	}

}
