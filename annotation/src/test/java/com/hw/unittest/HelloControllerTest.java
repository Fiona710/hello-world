package com.hw.unittest;

import com.hw.StartUpApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = StartUpApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    void setUp() throws MalformedURLException {
        String url = String.format("http://localhost:%d/",port);
        System.out.println(String.format("port is:[%d]",port));
        this.base = new URL(url);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void index() {
    }

    @Test
    void test1() {

        ResponseEntity<String> response = this.restTemplate.getForEntity(this.base.toString()+"/test",String.class,"");
        System.out.println(String.format("测试结果为：%s",response.getBody()));

    }
}