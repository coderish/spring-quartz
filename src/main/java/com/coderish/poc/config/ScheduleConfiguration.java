package com.coderish.poc.config;

import com.coderish.poc.components.ScheduleTask;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.quartz.TriggerBuilder.newTrigger;

@Configuration
public class ScheduleConfiguration {
    @Bean
    public JobDetail scheduleJob() {
        return JobBuilder.newJob(ScheduleTask.class).storeDurably().withIdentity("sample_schedule")
                .withDescription("Sample schedule task").build();
    }

    @Bean
    public Trigger scheduleTrigger() {
        return newTrigger().withIdentity("trigger").forJob(scheduleJob())
                .withSchedule(CronScheduleBuilder.cronSchedule("0 * * * * ?"))
                .build();
    }
}
