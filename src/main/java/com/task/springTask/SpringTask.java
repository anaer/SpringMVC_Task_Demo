package com.task.springTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("springTask")
public class SpringTask {
    // 注解驱动
    @Scheduled(cron = "0/2 * * * * ?")
    public void myTask() {
	System.out.println("注解调用！");
    }

    //配置文件驱动
    public void myTask2() {
	System.out.println("配置文件调用！");
    }
}