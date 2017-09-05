package com.ming.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ming.springboot.pojo.Notice;

public interface NoticeDao extends JpaRepository<Notice, Integer>{

}
