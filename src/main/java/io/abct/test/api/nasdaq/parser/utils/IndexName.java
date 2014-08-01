/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.abct.test.api.nasdaq.parser.utils;

/**
 *
 * @author San
 */
public enum IndexName {
    NASDAQ("NASDAQ"),DJIA("DJIA");
    
    private final String value;
    
    IndexName(String value) {    
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}
