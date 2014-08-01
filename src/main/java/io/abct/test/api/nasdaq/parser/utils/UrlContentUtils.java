/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.abct.test.api.nasdaq.parser.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author San
 */
public class UrlContentUtils extends ContentUtils {

    @Override
    public String loadContent() {
        try {
            URL resource = new URL("http://www.nasdaq.com");
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(resource.openStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(UrlContentUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
            return sb.toString();
        } catch (MalformedURLException ex) {
            Logger.getLogger(UrlContentUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
