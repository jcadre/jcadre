/**   
 * Copyright © 2017 金风科技  All rights reserved.
 * 
 * @Title: UUIDGenerator.java 
 * @Prject: soamRebuild
 * @Package: com.goldwind.common.utils 
 * @Description: 32位uuid生成工具
 * @author: JC
 * @date: 2017年3月16日 下午2:20:34 
 * @version: V1.0
 */
package com.jcadre.utils;

import java.util.UUID;

/** 
 * @ClassName: UUIDGenerator 
 * @Description: 32位uuid生成工具
 * @author: JC
 * @date: 2017年3月16日 下午2:20:34  
 */
public class UUIDGenerator {
	/**
	 * 生成UUID
	 * @return: String
	 */
    public static String getUUID()
    { 
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
