/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.abct.test.api.nasdaq.parser.utils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author San
 */
public class SendIndexClient {

    private static SendIndexClient instance  = null;
    private final ContentUtils contentUtils;

    protected SendIndexClient() {
        contentUtils = new UrlContentUtils();
    }
    
    public static SendIndexClient getInstance(){
        if(instance == null){
            instance = new SendIndexClient();
        }
        return instance;
    }
    
    public int sendIndex(IndexName indexName){   
        String index = contentUtils.getIndex(indexName);
        String payLoad = "{\"index-name\":\""+indexName.getValue()+"\",\"index-value\":\""+index+"\"}";
        
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://test-api.abct.io/test");
        Response resp = target.request(MediaType.APPLICATION_JSON).post(Entity.json(payLoad));
        return resp.getStatus();
    }
}
