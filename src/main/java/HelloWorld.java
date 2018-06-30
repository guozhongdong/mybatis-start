import com.gzd.mybatis.dao.UserMapper;
import com.gzd.mybatis.models.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author gzd
 * @create 2018-06-29 15:08
 * @desc
 **/
public class HelloWorld {

    private static SqlSessionFactory sqlSessionFactory ;
    private static Reader reader;

    static {

        try {
            reader = Resources.getResourceAsReader("Configure.xml");
            // 通过SqlSessionFactoryBuilder 创建 sqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
    public static void main(String[] args){
        //
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByID(1);
            //User user = sqlSession.selectOne("com.gzd.mybatis.dao.UserMapper.getUserByID",1);
            System.out.println(user);
        }finally {
            sqlSession.close();
        }

    }

}
