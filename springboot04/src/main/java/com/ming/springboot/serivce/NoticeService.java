package com.ming.springboot.serivce;

import java.util.Map;

public interface NoticeService {
	
	public Map<String, Object> findByPackage(Integer pageNum,Integer pageSize);

}
