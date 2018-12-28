package com.dukang.tushu.service;

import com.dukang.tushu.domain.BookInfoBean;

public interface IBookInfoService {

	/**
	 * 上传图书信息
	 * @param bookInfoBean 图书信息bean
	 */
	public void uploadBookInfo(BookInfoBean bookInfoBean);

}
