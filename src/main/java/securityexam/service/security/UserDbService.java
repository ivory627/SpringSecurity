package securityexam.service.security;

import java.util.List;

//스프링 시큐리티에서 필요한 정보를 가지고 오는 인터페이스
public interface UserDbService {
	public UserEntity getUser(String loginUserId);
	public List<UserRoleEntity> getUserRoles(String loginUserId);
}
