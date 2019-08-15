package dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yangyi.entity.UserEntity;
import com.yangyi.service.IUserService;

@Service(version = "1.0.0")
public class UserService implements IUserService {

	@Override
	public UserEntity getName(String id) {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

		UserEntity e = new UserEntity();

		e.setName("name eeeeeeeeeeee");
		e.setDesc("desc cccccccccc");

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");

		return e;
	}

}
