package com.example.boss.core.type;

/**
 * @description
 * @className: RType
 * @package: com.example.dingding.core.type
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:32
 */
public enum RType {
    成功(1),失败(2),登录失败(3);
    private int val;

    public  int getVal(){
        return val;
    }

    private  RType(int val){
        this.val=val;
    }
}
