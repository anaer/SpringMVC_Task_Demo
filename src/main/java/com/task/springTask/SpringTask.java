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

    @Scheduled(fixedRate = 5000)
    public void myTask3() {
        System.out.println("定时任务: @Scheduled(fixedRate = 5000), 每5000毫秒调用一次");
    }

    @Scheduled(fixedDelay = 5000)
    public void myTask4() {
        System.out.println("定时任务: @Scheduled(fixedDelay=5000), 任务完成后5000毫秒执行下次任务 ");
    }

    @Scheduled(cron = "0 0,30 8-23 * * MON-FRI")
    public void myTask5() {
        System.out.println("定时任务: @Scheduled(cron=\"0 0,30 8-23 ? * MON-FRI\"), 工作日8点到23点,整点与半点的时候执行一次");
    }
}