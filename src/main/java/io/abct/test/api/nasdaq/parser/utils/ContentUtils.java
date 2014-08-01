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
public abstract class ContentUtils {

    private static final String PREFIX_KEY = "nasdaqHomeIndexChart.storeIndexInfo(";
    private static final String SUFFIX_KEY = ");";
    private static final String DOUBLE_QUOTE = "\"";

    public abstract String loadContent();

    public String getIndex(IndexName indexName) {
        String prefixWithIndex = PREFIX_KEY+DOUBLE_QUOTE+indexName.getValue();
        if (loadContent() != null) {
            String content = loadContent();
            int beginIndex = content.indexOf(prefixWithIndex) + PREFIX_KEY.length();
            if(beginIndex == -1){
                return null;
            }
            int endIndex = content.indexOf(SUFFIX_KEY, beginIndex);
            String indexData = content.substring(beginIndex, endIndex).replace(DOUBLE_QUOTE, "");
            return indexData.split(",")[1];
        }
        return null;
    }
}
