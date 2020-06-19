package cn.sherlock.InternalClass;

public class Player {
    public FightAble select(String str){//返回值是一个接口类型
        if("法力角色".equals(str)){
            return new FaShi();
        }else if ("武力角色".equals(str)){
            return new ZhanShi();
        }
        return null;
    }
}
