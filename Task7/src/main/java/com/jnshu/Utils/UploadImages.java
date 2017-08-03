package com.jnshu.Utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import javax.swing.*;

/**
 * Created by Tom on 2017/7/24.
 */
public class UploadImages {


    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {


//        打开文件选择框，
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        String filePath=""+fc.getSelectedFile();
        System.out.println("选择的文件路径："+filePath);//输出文件路径


        String newURL = filePath.replaceAll("\\\\","\\\\"+"\\\\");
        System.out.println("转义后的文件路径："+newURL);



//构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());
//...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
//...生成上传凭证，然后准备上传
        String accessKey = "8d8-mbQ0ViFCf9K5-dHOmATa8pdgmKRSIwO-CMrW";
        String secretKey = "bnltfFxu5hx-XWPnotM4nvoUGgbv2ynG57-fDmN4";
        String bucket = "wuzhiyong";
//如果是Windows情况下，格式是 D:\\qiniu\\test.png
        String localFilePath = "D:\\aaa.jpg";
//默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = "www.jpg";

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }

    }

}
