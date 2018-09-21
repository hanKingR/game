package com.minigame.www.tool;

import com.minigame.www.tool.enums.ReturnInfoStatusEnum;

import java.util.HashMap;
import java.util.Map;

public class ReturnInfo {
	private static final String STATUS = "status";
	private static final String MESSAGE = "message";
	private static final String DATA = "data";
	private static final String ERRORCODE = "errorCode";

	public static Map<String, Object> returnInfo(ReturnInfoStatusEnum returnInfoStatusEnum) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(STATUS, returnInfoStatusEnum.getEnMsg());
		return map;
	}

	public static Map<String, Object> returnInfo(ReturnInfoStatusEnum returnInfoStatusEnum, Object message) {
		Map<String, Object> map = returnInfo(returnInfoStatusEnum);
		map.put(MESSAGE, StringUtil.isNotEmpty(message)?message:"");
		return map;
	}

	public static Map<String, Object> returnInfo(ReturnInfoStatusEnum returnInfoStatusEnum, Object message,
			Object data) {
		Map<String, Object> map = returnInfo(returnInfoStatusEnum, message);
		map.put(DATA, StringUtil.isNotEmpty(data)?data:"");
		return map;
	}
	
	public static Map<String, Object> returnInfo(ReturnInfoStatusEnum returnInfoStatusEnum, Object message,
			Object data,String errCode) {
		Map<String, Object> map = returnInfo(returnInfoStatusEnum, message,data);
		map.put(ERRORCODE, errCode);
		return map;
	}

}
