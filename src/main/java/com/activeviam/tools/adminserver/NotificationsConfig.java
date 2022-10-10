/*
 * (C) ActiveViam 2022
 * ALL RIGHTS RESERVED. This material is the CONFIDENTIAL and PROPRIETARY
 * property of ActiveViam. Any unauthorized use,
 * reproduction or transfer of this material is strictly prohibited
 */
package com.activeviam.tools.adminserver;

import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author ActiveViam
 */
//@Configuration
@Slf4j
@EnableScheduling
public class NotificationsConfig {

	@Autowired
	InstanceRepository instanceRepository;

	@Scheduled(fixedRate = 30, timeUnit = TimeUnit.SECONDS)
	void checkMetrics() {
		var instances = instanceRepository.findAll().collectList().block();
		if (Objects.nonNull(instances)) {
			log.info("Instances: {}", instances.size());
		}
	}

}
