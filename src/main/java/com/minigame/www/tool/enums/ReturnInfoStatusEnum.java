package com.minigame.www.tool.enums;

public enum ReturnInfoStatusEnum {
    SUCCESS("0000","成功","success"),
    EMPTY("4001","空值","empty"),
    EXIST("4002","数据存在","exist"),
    ERROR("4000","错误","error");
	
    private final String info;
    private final String msg;
    private final String enMsg;
    ReturnInfoStatusEnum(String info, String msg, String enMsg) {
        this.info = info;
        this.msg = msg;
        this.enMsg = enMsg;
        
    }
    public String getInfo() {
        return info;
    }
    
    public String getMsg() {
        return msg;
    }

    public String getEnMsg(){
        return enMsg;
    }


}
