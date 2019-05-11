package com.demo.dubbo;


import org.apache.dubbo.config.annotation.Service;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/5/8 17:30
 * @since
 */
@Service(interfaceClass =DubboProviderAPI.class)
public class DubboProvider implements DubboProviderAPI {
    @Override
    public String hello() {
        return "hello world";
    }
}
