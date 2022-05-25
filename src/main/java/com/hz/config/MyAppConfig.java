package com.hz.config;

import com.hz.servlet.MyServlet;
import com.hz.web.LoginInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        ServletRegistrationBean bean=new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/test");
        return bean;
    }



    //添加拦截器注册到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截的地址
        String path[]={"/user/**"};
        //放行的地址
        String excludePath[]={"/user/login"};
        //创建拦截器对象
        LoginInterceptor interceptor=new LoginInterceptor();
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }
}
