package br.com.lelo.twclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MainApplication {

    public static void main(String[] args)  {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public LogFilter simpleFilter() {
        return new LogFilter();
    }

}
