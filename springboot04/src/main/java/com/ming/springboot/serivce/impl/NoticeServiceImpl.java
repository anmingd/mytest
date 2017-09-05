package com.ming.springboot.serivce.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ming.springboot.dao.NoticeDao;
import com.ming.springboot.pojo.Notice;
import com.ming.springboot.serivce.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public Map<String, Object> findByPackage(Integer pageNum, Integer pageSize) {
		Page<Notice> page = noticeDao.findAll(new PageRequest(pageNum-1, pageSize));
		Map<String, Object> result = null;
		if(page!=null){
			result = new HashMap<>();
			List<Notice> rows = page.getContent();
			long total = page.getTotalElements();
			result.put("rows", rows);
			result.put("total", total);
		}
		return result;
	}

}
