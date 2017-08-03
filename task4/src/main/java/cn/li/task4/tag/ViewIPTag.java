package cn.li.task4.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/13.
 */
public class ViewIPTag implements Tag{
private PageContext pageContext;
public int doStartTag() throws JspException{
    System.out.println("调用DoStartTag（）方法");
    HttpServletRequest request=(HttpServletRequest)pageContext.getRequest();
    JspWriter out =pageContext.getOut();
    String ip=request.getRemoteAddr();
    try{
        out.write(ip);
    }catch(IOException e){
        throw new RuntimeException(e);
    }
    return 0;
}
public int doEndTag() throws JspException{
    System.out.println("调用doEndTag");
    return 0;
}

public  void setPageContext(PageContext var1){
    System.out.println("setPageContext(pageContext pageContext)");
    this.pageContext=pageContext;
}
public void setParent(Tag var1){}
public Tag getParent(){
    return null;
}
public void release(){
    System.out.println("调用release方法");
}
}
