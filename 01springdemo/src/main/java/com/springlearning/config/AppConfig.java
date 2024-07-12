package com.springlearning.config;

import org.springframework.asm.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.springlearning.Alien;
import com.springlearning.Computer;
import com.springlearning.Desktop;
import com.springlearning.Laptop;

@Configuration
@ComponentScan("com.springlearning")
public class AppConfig {

    // @Bean
    // public Alien alien(@Autowired Computer com) {
    //     Alien obj = new Alien();
    //     obj.setAge(29);
    //     obj.setCom(com);
    //     return obj;
    // }

    @Bean
    public Alien alien(@Qualifier("desk1")  Computer com) {
        Alien obj = new Alien();
        obj.setAge(29);
        obj.setCom(com);
        return obj;
    }

    @Bean(name = {"com2","desk1","desk2"})
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }
}
