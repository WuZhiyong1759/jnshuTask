package com.jnshu.Utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import javax.swing.*;

/**
 * Created by Tom on 2017/7/25.
 */
public class ImagesUtil {

    private static String accessKey = null;
    private static String secretKey = null;
    private static String bucket = null;
    private static Configuration cfg;

    public ImagesUtil(String accessKey,String secretKey,String bucket){
        this.accessKey=accessKey;
        this.secretKey=secretKey;
        this.bucket=bucket;
        //构造一个带指定Zone对象的配置类
        this.cfg = new Configuration(Zone.zone2());
    }

    public  void UpLoadImgs(String file) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        //打开文件选择框，
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        String filePath=""+fc.getSelectedFile();
        System.out.println("选择的文件路径："+filePath);//输出文件路径

        String newURL = filePath.replaceAll("\\\\","\\\\"+"\\\\");
        System.out.println("转义后的文件路径："+newURL);
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        //如果是Windows情况下，格式是 D:\\qiniu\\test.png
        String localFilePath = newURL;
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = file;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            System.out.println("上传文件，状态码："+response.statusCode);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
            System.out.println("图片外链："+"http://otjrc4xc4.bkt.clouddn.com/"+key);
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
    public  void DeleteImgs(String fileName){
        String key = fileName;
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            Response response=bucketManager.delete(bucket, key);
            System.out.println("删除文件状态码："+response.statusCode);
        } catch (QiniuException ex) {
            //如果遇到异常，说明删除失败
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
        }


    }

}
