package com.hepai.admin.service.impl;

import com.hepai.admin.po.custom.ShareSpaceCustom;
import com.hepai.admin.po.custom.ShareSpaceQo;
import com.hepai.admin.service.ShareSpaceService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShareSpaceServiceImplTest {

    @Test
    public void querySpace() throws Exception {
        ShareSpaceQo spaceQo = new ShareSpaceQo();
        Byte type = 1;
        spaceQo.setType(type);
        spaceQo.setRentOrderType(1);
        spaceQo.setCreateTimeOrderType(0);
        spaceQo.setPagesize(1);
        Map map = shareSpaceService.querySpace(spaceQo);
        System.out.println(map);
    }

    @Autowired
    private ShareSpaceService shareSpaceService;

    @Test
    public void add() throws Exception {
        ShareSpaceCustom shareSpaceCustom = new ShareSpaceCustom();
        Integer[] pic_ids = {2, 3, 5};
        shareSpaceCustom.setTitle("title");
        shareSpaceCustom.setAddress("add");
        shareSpaceCustom.setShareDays("2019-11-10");
        shareSpaceCustom.setContact("lisi");
        shareSpaceCustom.setContactMobile("18921221111");
        Byte isApproved = 0;
        shareSpaceCustom.setIsApproved(isApproved);
        shareSpaceCustom.setArea(0.0);
        shareSpaceCustom.setRent(0.0);
        shareSpaceCustom.setPictureIdArr(pic_ids);
        shareSpaceCustom.setUserId(0);
        Byte type = 1;
        shareSpaceCustom.setType(type);
        boolean rs = shareSpaceService.add(shareSpaceCustom);
        Assert.assertTrue(rs);
    }



}