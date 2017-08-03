import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;
import com.qiniu.http.Response;
import org.junit.Test;

import javax.swing.*;

/**
 * Created by Tom on 2017/7/25.
 */
public class test {
    @Test
    public void testImages() throws Exception {

        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());
//...其他参数参考类注释

        String accessKey = "8d8-mbQ0ViFCf9K5-dHOmATa8pdgmKRSIwO-CMrW";
        String secretKey = "bnltfFxu5hx-XWPnotM4nvoUGgbv2ynG57-fDmN4";
        String bucket = "wuzhiyong";
        String key = "bb.jpg";

        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            bucketManager.delete(bucket, key);

        } catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
        }




        //        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        JFileChooser fc=new JFileChooser();
//        fc.showOpenDialog(null);
//        System.out.println(fc.getSelectedFile());
//        String str = ""+fc.getSelectedFile();
//
//        String newURL = str.replaceAll("\\\\","\\\\"+"\\\\");
//        System.out.println(newURL);
    }

}
