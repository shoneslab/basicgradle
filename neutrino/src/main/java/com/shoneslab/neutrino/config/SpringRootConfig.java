package com.shoneslab.neutrino.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.shoneslab.neutrino.service" })
public class SpringRootConfig {
}