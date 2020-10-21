```java
package cn.hellomyheart.kataba.third;

import cn.hellomyheart.kataba.util.StrUtil;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.json.JSONObject;

/**
 * @description
 * @className: SmsUtil
 * @package: cn.hellomyheart.kataba.third
 * @author: Stephen Shen
 * @date: 2020/10/20 上午11:37
 */
public class SmsUtil {
    //短信发送
    public static boolean sendRCode(String phone, int code) {
        //配置对象
        DefaultProfile profile = DefaultProfile.
                getProfile();
        //实例化短信发送对象
        IAcsClient client = new DefaultAcsClient(profile);
        //构建请求对象
        CommonRequest request = new CommonRequest();
        //设置请求方式
        request.setSysMethod(MethodType.POST);
        //设置短信服务的地址
        request.setSysDomain("dysmsapi.aliyuncs.com");
        //系统版本号
        request.setSysVersion("");
        //调用的接口
        request.setSysAction("SendSms");
        //设置域
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //设置签名
        request.putQueryParameter("SignName", "");
        //设置模板
        request.putQueryParameter("TemplateCode", "");
        //设置手机号
        request.putQueryParameter("PhoneNumbers", phone);
        //设置验证码
        request.putQueryParameter("TemplateParam", "{\"code\":" + code + "}");
        try {
            //接收响应
            CommonResponse response = client.getCommonResponse(request);
            String json = response.getData();
            if (StrUtil.checkNoEmpty(json)) {
                JSONObject jo = new JSONObject(json);
                return jo.getString("Code").equals("OK");
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return false;
    }


}

```
