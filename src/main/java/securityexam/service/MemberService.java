package securityexam.service;

import securityexam.dto.Member;
import securityexam.service.security.UserDbService;

//회원관련 정보처리하는 서비스
public interface MemberService extends UserDbService {

	void addMember(Member member, boolean b);

	Member getMemberByEmail(String loginId);

}
