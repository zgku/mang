package com.zgku.mangadmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zgku
 * @create: 2020-06-24 15:25
 **/
@Configuration
@MapperScan("com.zgku.manggenerator.mbg.mapper")
public class MyBatisConfig {
}
