package securityexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring 설정파일
//레이어드 아키텍처에서 Controller가 사용하는 Bean들에 대해 설정을 한다.
//dao, service를 컴포넌트 스캔하여 찾도록 한다.
//어노테이션으로 트랜잭션을 관리하기 위해 @EnableTransactionManagement를 설정하였다.

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages= {"securityexam.dao","securityexam.service"})
public class ApplicationConfig {

}
