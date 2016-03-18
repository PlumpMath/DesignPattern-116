package com.util.xml;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 
 * @Title: Dom4jParseXml.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>
 * @Created on 2014-5-30 下午6:06:57
 * @author 杨凯
 */
public class Dom4jParseXml {

    /**
     * 解析xml,模拟spring从配置文件根据bean id获取class对象
     * 
     * @param file
     */
    public static String parserXml(File file,String name) {
        String clazz = "";
        try {
            List<Element> root = new SAXReader().read(new FileInputStream(file)).getRootElement().elements();
            for (Element i : root) {
                String id = i.attributeValue("id");
                clazz = i.attributeValue("class");
                if(id.equals(name))
                  break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazz;
    }

    /**
     * 字符串转xml
     * 
     * @param result
     */
    public void String2Xml(String result) {
        try {
            if (StringUtils.isNotBlank(result)) {
                Document document = DocumentHelper.parseText(result);
                List<Element> root = document.getRootElement().elements();
                if (root != null && root.size() > 0) {
                    for (Element i : root) {
                        String title = i.element("title").getTextTrim(); // title
                        System.out.println(title);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * xml转字符串
     * 
     * @param result
     */
    public void Xml2String(String result) {
        try {
            if (StringUtils.isNotBlank(result)) {
                Document document = DocumentHelper.parseText(result);
                String text = document.asXML();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
