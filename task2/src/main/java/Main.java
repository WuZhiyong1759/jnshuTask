import java.io.InputStream;
import java.util.List;

import com.ptteng.service.StudentService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptteng.dao.StudentDao;
import com.ptteng.entity.Student;

public class Main {


	public static void main(String[] args){


//		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc-conf.xml");
//		StudentDao dao = (StudentDao)context.getBean("studentDao");
//		List<Student> list = dao.getAllStudents();
//		for(Student s : list){
//			System.out.println("1->" + s.getStu_name());
//		}
//
//		Student st = (Student)context.getBean("student");
//		st.setId(1);
//		System.out.println(st.getId());

//		StudentDaoImpl impl = (StudentDaoImpl)context.getBean("studentDaoImpl");
//		List<Student> list2 = impl.getAllStudents();
//		for(Student s : list2){
//			System.out.println("2->" + s.getStu_name());
//		}
//		Student stu = impl.getStu();
//		System.out.println(stu.getStu_name());
//
//		logger.debug("This is debug message.");
//		logger.info("This is info message.");
//		logger.error("This is error message.");


//		//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
//		InputStream is = Main.class.getClassLoader().getResourceAsStream("mybatis-conf.xml");
//		//构建sqlSession的工厂
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//		SqlSession session = sessionFactory.openSession();
//		String statement = "mybatis.mapper.userMapper.getUser";//映射sql的标识字符串
//
//		//执行查询返回一个唯一user对象的sql
//		List<Student> list = session.selectList("com.ptteng.dao.StudentDao.getAllStudents", 1);
//		Student stu = list.get(0);
//		System.out.println(stu.getStu_name());

//        PropertyConfigurator.configure("log4j.properties");
        Logger logger  = Logger.getLogger(Main.class);
        logger.debug( " debug " );
        logger.error( " error " );
        logger.debug("hehe");

//        ApplicationContext context = new ClassPathXmlApplicationContext("springmvc-conf.xml");
//        StudentService studentService = (StudentService) context.getBean("studentService");


//        Student s = new Student(1,"李涛",0,0,"老大最帅","清华大学","马伟江");
//        try {
//            int rs = studentService.addStudent(s);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        try {
//            s = studentService.findStudentById(5);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
	}
}
