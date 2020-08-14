package com.lingtu.springbootc3p0jpa.service;

import com.lingtu.springbootc3p0jpa.pojo.ADocter;
import com.lingtu.springbootc3p0jpa.repository.DocterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocterServiceImpl implements DocterService{

    @Autowired
    private DocterRepository docterRepository;
    @Override
    public int addDocter(ADocter aDocter) {
        return docterRepository.save(aDocter).getId();
    }
}
