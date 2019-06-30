package com.hepai.admin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OssBucketServiceTest {

    @Autowired
    private OssBucketService fileService;

    @Test
    public void createBucket() throws Exception {
        boolean rs = fileService.createBucket("app-test-picture");
        System.out.println(rs);
    }

}