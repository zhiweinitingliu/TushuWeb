package com.dukang.tushu.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dukang.tushu.domain.BookInfoBean;

@Repository
public interface BookInfoDao {
	
	public void uploadBookInfo(BookInfoBean bookInfoBean);

}
