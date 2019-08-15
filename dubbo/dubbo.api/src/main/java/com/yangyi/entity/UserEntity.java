package com.yangyi.entity;

public class UserEntity {

	private String name;
	private String desc;

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", desc=" + desc + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
