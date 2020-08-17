package com.ssp.ding.configuration;

import com.ssp.ding.DingConfigStorage;
import com.ssp.ding.DingService;
import com.ssp.ding.config.DingConfigStorageImpl;
import com.ssp.ding.properties.DingProperties;
import com.ssp.ding.service.DingLogger;
import com.ssp.ding.service.DingTalkClientFactory;
import com.ssp.ding.service.impl.DefaultDingLogger;
import com.ssp.ding.service.impl.DefaultDingService;
import com.ssp.ding.service.impl.DefaultDingTalkClientFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 钉钉自动装配
 *
 * @author: sunshaoping
 * @date: Create by in 4:24 下午 2020/6/7
 */
@Configuration
@Import(ConverterConfiguration.class)
@RequiredArgsConstructor
@EnableConfigurationProperties(DingProperties.class)
@ConditionalOnClass(DingService.class)
@ConditionalOnProperty(prefix = DingProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = true)
public class DingConfiguration {

    private final DingProperties dingProperties;

    @Bean
    @ConditionalOnMissingBean(name = "dingService")
    public DefaultDingService dingService(DingConfigStorage dingConfigStorage, DingTalkClientFactory dingTalkClientFactory, DingLogger logger) {
        return new DefaultDingService(dingConfigStorage, dingTalkClientFactory, logger);
    }

    @Bean
    @ConditionalOnMissingBean
    public DingLogger dingLogger() {
        return new DefaultDingLogger();
    }

    @Bean
    @ConditionalOnMissingBean
    public DingConfigStorage dingConfigStorage() {
        return new DingConfigStorageImpl(dingProperties);
    }

    @Bean
    @ConditionalOnMissingBean
    public DingTalkClientFactory dingTalkClientFactory() {
        return new DefaultDingTalkClientFactory(dingProperties);
    }


}
