package com.task.springTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("springTask")
public class SpringTask {
    @Scheduled(cron = "0/2 * * * * ?")
    public void myTask() {
	System.out.println("这个任务两秒执行一次！");
    }

}