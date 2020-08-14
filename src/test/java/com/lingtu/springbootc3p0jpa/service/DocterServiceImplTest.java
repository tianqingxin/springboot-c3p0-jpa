package com.lingtu.springbootc3p0jpa.service;

import com.lingtu.springbootc3p0jpa.pojo.ADocter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DocterServiceImplTest {

    @Autowired
    private DocterService docterService;

    @Test
    void addDocter() {
        ADocter docter = new ADocter();
        docter.setDocName("张三");
        docter.setGrantId(1);
        docter.setIsEnable("1");
        docter.setOfficeId(2);
        docter.setPhoneNum("123");

        int s = docterService.addDocter(docter);
        assertNotEquals(0, s);
        System.out.println(s);
    }
}