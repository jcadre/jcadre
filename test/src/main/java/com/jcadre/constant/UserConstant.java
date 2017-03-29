/**
 * 用户管理相关常量
 */
package com.jcadre.constant;

/**
 * @author JC
 * 2017年3月29日
 */
public interface UserConstant {
	// 用户状态
	public static final int STATUS_PENDING = 0; // 待激活
	public static final int STATUS_NORMAL = 1; // 正常
	public static final int STATUS_FREEZE = 2; // 冻结
	public static final int STATUS_DEL = 3; // 删除
	
	// 性别
	public static final int SEX_WOMEN = 0;
	public static final int SEX_MAN = 1;
}
