package securityexam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import securityexam.service.security.UserEntity;
import securityexam.service.security.UserRoleEntity;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public UserEntity getUser(String loginUserId) {
		return new UserEntity("sanga","$2a$10$JHyGN4WBGP3wujD84hZy8O9qEg1/NBFKTIiWP3smLjXXCVUiyitwu");
	}

	@Override
	public List<UserRoleEntity> getUserRoles(String loginUserId) {
		List<UserRoleEntity> list = new ArrayList<UserRoleEntity>();
		list.add(new UserRoleEntity("sanga", "ROLE_USER"));
		return list;
	}

}
