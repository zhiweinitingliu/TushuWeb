package com.dukang.tushu.domain;

public class BookInfoBean {
	
//	CREATE TABLE `ts_book` (
//			  `id` bigint(20) NOT NULL DEFAULT '1000' COMMENT '图书id',
//			  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '图书名称',
//			  `auth` varchar(255) NOT NULL DEFAULT '' COMMENT '作者',
//			  `publish_house` varchar(255) NOT NULL DEFAULT '' COMMENT '出版社',
//			  `image` varchar(255) NOT NULL COMMENT '图书主图',
//			  `image_id` bigint(255) NOT NULL COMMENT '图片的id',
//			  `publish_user_id` int(255) NOT NULL COMMENT '发布图书的用户id',
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
	
	private int id;
	private String name;
	private String auth;
	private String publish_house;
	private String image;
	private int  image_id;
	private int publish_user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getPublish_house() {
		return publish_house;
	}
	public void setPublish_house(String publish_house) {
		this.publish_house = publish_house;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getPublish_user_id() {
		return publish_user_id;
	}
	public void setPublish_user_id(int publish_user_id) {
		this.publish_user_id = publish_user_id;
	}
	
	
	

}
