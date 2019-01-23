package com.DOM4jTest;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;


public class DOM4JTest {
    public static void main(String[] args)throws Exception{
        //创建文件
        File file = new File("D:"+File.separator+"郑海波"+File.separator+"knowledge"+File.separator+"0123.xml");

       // createXML(file);

        readXML(file);



    }


    public static void createXML(File file)throws Exception{
        Document document = DocumentHelper.createDocument();

        Element rootElement = document.addElement("root");

        Element nameElement = rootElement.addElement("name");

        Element detailElement = rootElement.addElement("detail");

        nameElement.setText("A");

        detailElement.setText("B");

        //输出数据
        OutputFormat outFormat = OutputFormat.createPrettyPrint();

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(file),outFormat);

        xmlWriter.write(document);
    }

    public static void readXML(File file)throws Exception {

        SAXReader sax = new SAXReader();

        Document document = sax.read(file);

        Element rootElement = document.getRootElement();

        System.out.println(rootElement.getName());

//        List<Element> list = rootElement.
//
//        while(it.hasNext()){
//            Element element = it.next();
//            System.out.println("name"+element.elementText("name"));
//            System.out.println("detail"+element.elementText("detail"));
//        }


    }

}
