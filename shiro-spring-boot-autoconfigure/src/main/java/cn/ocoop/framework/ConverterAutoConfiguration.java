package cn.ocoop.framework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.ocoop.framework.converter.String2ObjectGenericConverter;

/**
 * 类的描述.
 *
 * @author tan liansheng on 2018/5/9 8:57
 */

@Configuration
public class ConverterAutoConfiguration {


    /**
     * 配置转换器 需要提前初始化(在ShiroAutoConfiguration之前,否则会有循环依赖的问题)
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(String2ObjectGenericConverter.class)
    public String2ObjectGenericConverter string2ObjectGenericConverter(){
        return new String2ObjectGenericConverter();
    }
}
