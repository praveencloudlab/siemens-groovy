package com

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class GormExample {
    static void main(String[] args) {
       ConfigurableApplicationContext context= SpringApplication.run(GormExample,args);
       // println(context)
    }
}
