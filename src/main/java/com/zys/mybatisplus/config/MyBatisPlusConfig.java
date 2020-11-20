package com.zys.mybatisplus.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.zys.mybatisplus.mapper")
@EnableTransactionManagement
@Configuration // 配置类
public class MyBatisPlusConfig {

     // 注册乐观锁插件    
     @Bean
     public OptimisticLockerInterceptor optimisticLockerInterceptor() {
         return new OptimisticLockerInterceptor();
     }


    // 分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
         return new PaginationInterceptor();
     }

    // 逻辑删除组件！
    @Bean
    public ISqlInjector sqlInjector() {
         return new LogicSqlInjector();
     }



}
