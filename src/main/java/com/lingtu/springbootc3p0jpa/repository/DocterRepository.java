package com.lingtu.springbootc3p0jpa.repository;

import com.lingtu.springbootc3p0jpa.pojo.ADocter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocterRepository extends JpaRepository<ADocter,Integer> {

}
