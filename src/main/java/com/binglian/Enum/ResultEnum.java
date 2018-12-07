package com.binglian.Enum;

public enum ResultEnum {
	Article_ok(10,"添加成功"),
	Article_delete(11,"删除成功"),
	Category_ok(12,"添加成功"),
	;

	private Integer code;
	
	private String message;
	
	ResultEnum(Integer code,String message){
		this.code=code;
		this.message=message;
	}
	
	
}
