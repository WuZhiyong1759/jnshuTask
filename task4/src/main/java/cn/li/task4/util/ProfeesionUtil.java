package cn.li.task4.util;

/**
 * Created by Administrator on 2017/4/15.
 */
public class ProfeesionUtil {


    public String ProfessionDirectionToStringwithType(int type) {
        switch (type) {
            case 1: {
                return "前端开发";
            }
            case 2: {
                return "后端开发";
            }
            case 3: {
                return "移动开发";
            }
            case 4: {
                return "整站开发";
            }
            case 5: {
                return "运营维护";
            }
            default: {
                return "其他";
            }
        }
    }
        public String ProfessionNameToStringWithType(int type){
            switch (type){
                case 1:{
                    return "CSS";
                }
                case 2:{
                    return "js";

                }
                case 3:{
                    return "ANDROID";
                }
                case 4:{
                    return "IOS";

                }
                case 5:{
                    return "JAVA";
                }
                case 6:{
                    return "OP";
                }
                case 7:{
                    return "PM";
                }
                case 8:{
                    return "UI";
                }
                default:
                    return "其他";
            }
            }
    }



