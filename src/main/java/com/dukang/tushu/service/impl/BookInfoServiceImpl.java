package com.dukang.tushu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dukang.tushu.dao.BookInfoDao;
import com.dukang.tushu.domain.BookInfoBean;
import com.dukang.tushu.service.IBookInfoService;

@Service("bookInfoService")
public class BookInfoServiceImpl  implements IBookInfoService{
	
	@Resource
	private BookInfoDao bookInfoDao;


	@Override
	public void uploadBookInfo(BookInfoBean bookInfoBean) {
		bookInfoDao.uploadBookInfo(bookInfoBean);
		
	}

}
