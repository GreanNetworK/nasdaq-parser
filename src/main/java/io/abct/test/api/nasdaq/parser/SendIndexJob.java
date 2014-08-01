/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.abct.test.api.nasdaq.parser;

import io.abct.test.api.nasdaq.parser.utils.IndexName;
import io.abct.test.api.nasdaq.parser.utils.SendIndexClient;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author San
 */
public class SendIndexJob implements Job {

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        
        IndexName indexName = IndexName.NASDAQ;
        SendIndexClient sendIndexClient = SendIndexClient.getInstance();
        sendIndexClient.sendIndex(indexName);
    }

}
