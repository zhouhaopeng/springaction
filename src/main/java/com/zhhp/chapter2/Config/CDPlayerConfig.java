package com.zhhp.chapter2.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
}


/**
 * 自动扫描的配置方式
 * @Configureable 默认扫描与配置类相同的包
 * basePackages = {“com.zhhp.chapter2”} 配送多个扫描包
 * basePackageClasses= {CDPlayerConfig.class} 配置多个Class配置类相同的包
 *类似于<context:component-scan base-package="com.zhhp.chapter2/>
 * */