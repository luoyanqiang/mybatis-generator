package com.hepai.admin.service.impl;

import com.hepai.admin.service.SpaceTagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaceTagServiceImplTest {

    @Autowired
    private SpaceTagService spaceTagService;

    @Test
    public void getList() throws Exception {
        List list = spaceTagService.getList(null);
        System.out.println(list);
    }

}