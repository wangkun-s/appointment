package com.example.appointment.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis Plus之主键为uuid设计为Long型带来的问题
 * 由于返回的id均为Long型，在前端被处理成Number时，无法根据此不精确的整数查询到正确的结果
 * 根本原因：JavaScript的Number类型能表示并进行精确算术运算的安全整数范围为：正负(2^{53}-1)（16位数）
 * 而 MyBatis Plus 采用 雪花算法 Long型 19位数
 * <p>
 * JsonInclude.Include.NON_NULL 如果字段值为 Null 时 不参与序列化，也就是不返回给前台。
 * 如果前台需要返回全部字段，为null时也返回，需要设置 JsonInclude.Include.ALWAYS。
 * 解决办法：https://www.jianshu.com/p/d7d63696eb89
 *
 * @author King
 */
@Configuration
public class LongIdToStringConfig {

        @Bean
    public Jackson2ObjectMapperBuilderCustomizer customJackson() {
        return jacksonObjectMapperBuilder -> {
            jacksonObjectMapperBuilder.serializationInclusion(JsonInclude.Include.NON_NULL);
            // Jackson全局转换long类型为String，解决jackson序列化时long类型缺失精度问题
            // 自定义Long类型转换 超过12个数字用String格式返回，由于js的number只能表示15个数字
            jacksonObjectMapperBuilder.serializerByType(Long.class, ToStringSerializer.instance);
            jacksonObjectMapperBuilder.serializerByType(Long.TYPE,ToStringSerializer.instance);
            jacksonObjectMapperBuilder.failOnUnknownProperties(false);
            jacksonObjectMapperBuilder.propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        };
    }
//    @Bean
//    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
//        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
//        //忽略value为null 时 key的输出
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//
//        /**
//         * 序列换成json时,将所有的long变成string
//         * 因为js中得数字类型不能包含所有的java long值
//         */
//        SimpleModule module = new SimpleModule();
//        module.addSerializer(Long.class, ToStringSerializer.instance);
//        module.addSerializer(Long.TYPE, ToStringSerializer.instance);
//        objectMapper.registerModule(module);
//        return objectMapper;
//    }

}
