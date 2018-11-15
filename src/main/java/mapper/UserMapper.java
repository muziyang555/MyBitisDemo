package mapper;

import bean.User;

/**
 * Created by liyangbd on 2018/11/14.
 */
public interface UserMapper {

	User GetUserByID(Integer id) throws Exception;

}
