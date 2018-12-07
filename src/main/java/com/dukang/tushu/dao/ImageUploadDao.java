package com.dukang.tushu.dao;


import org.springframework.stereotype.Repository;

import com.dukang.tushu.domain.ImageBean;

@Repository
public interface ImageUploadDao {
	
	/**
	 * 将上传的图片信息保存到图片表中
	 * @return 返回保存的图片信息
	 */
	public int saveImageInfo(ImageBean imageBean) ;

}
