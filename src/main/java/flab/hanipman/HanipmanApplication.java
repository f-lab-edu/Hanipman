package flab.hanipman;

import flab.hanipman.domain.Member;
import flab.hanipman.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
public class HanipmanApplication implements CommandLineRunner {

	@Autowired
	private MemberRepository memberRepository;

	public static void main(String[] args)  {
		SpringApplication.run(HanipmanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		memberRepository.save(new Member("Jason Jung", "Seoul", "20240322"));
		memberRepository.save(new Member("Sally Kim", "Busan", "20240322"));

		System.out.println("Members found with findAll():");
		System.out.println("-------------------------------");
		for (Member member : memberRepository.findAll()) {
			System.out.println(member.getName());
		}
	}
}
