package flab.hanipman.repository;

import flab.hanipman.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void setup() {
        memberRepository.deleteAll();
    }

    @DisplayName("멤버 save 테스트")
    @Test
    void memberSave() {
        //given
        Member member = new Member("Jason Jung", "Seoul", "20240322");

        //when
        Member savedMember = memberRepository.save(member);

        //then
        assertThat(savedMember.getId()).isNotNull();
        assertThat(savedMember.getName()).isEqualTo(member.getName());
        assertThat(savedMember.getAddress()).isEqualTo(member.getAddress());
    }
}