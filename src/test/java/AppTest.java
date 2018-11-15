import bean.User;
import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

/**
 * Created by liyangbd on 2018/11/14.
 */
public class AppTest
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue()
	{

		try {
			//使用MyBatis提供的Resources类加载mybatis的配置文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			//构建sqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

			SqlSession session= sessionFactory.openSession();
			UserMapper mapper=session.getMapper(UserMapper.class);
			User user= mapper.GetUserByID(1);
			System.out.println(user.toString());

			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}