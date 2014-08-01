/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.abct.test.api.nasdaq.parser;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author San
 */
public class App {

    public static void main(String[] args) throws SchedulerException {
        JobDetail job = JobBuilder
                .newJob(SendIndexJob.class)
                .withDescription("SendIndexJob")
                .build();

        SimpleTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("SendIndexJob")
                .withSchedule(
                        SimpleScheduleBuilder
                        .simpleSchedule()
                        .withIntervalInSeconds(300)
                        .repeatForever()
                ).build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job, trigger);
    }
}
