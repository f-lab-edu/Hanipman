package flab.hanipman;

import flab.hanipman.domain.Member;
import flab.hanipman.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HanipmanApplicationTests {

	@Autowired
	private MemberRepository memberRepository;
	@Test
	void contextLoads() {
	}
}
