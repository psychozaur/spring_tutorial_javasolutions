package com.rybickim.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.rybickim.spring.implementations")
@Import(Config.class)
public class AutoConfig {
}
