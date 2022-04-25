package com.ding.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.xml.XmlMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Actionding
 * @create 2022-04-25 15:35
 */
public class JacksonTest {

    /**
     * Jackson序列化的主要类是ObjectMapper，它是一个线程安全的类，可以初始化并配置一次，被多个线程共享，
     * SerializationFeature.INDENT_OUTPUT的目的是格式化输出，以便于阅读。
     * ObjectMapper的writeValueAsString方法就可以将对象序列化为字符串
     *
     * @throws JsonProcessingException
     */
    @Test
    public void testJSON() throws JsonProcessingException {
        Student student = new Student("吉姆", 18, 82);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String str = mapper.writeValueAsString(student);

        System.out.println(str);

        // 要有无参构造方法
        Student stu = mapper.readValue(str, Student.class);
        System.out.println(stu);
    }


    @Test
    public void testXML() throws IOException {
        Student student = new Student("吉姆", 18, 82);

        XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        String str = mapper.writeValueAsString(student);

        System.out.println(str);

        Student stu = mapper.readValue(str, Student.class);
        System.out.println(stu);
    }
}
