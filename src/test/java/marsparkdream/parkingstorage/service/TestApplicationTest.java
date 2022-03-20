package marsparkdream.parkingstorage.service;

import marsparkdream.parkingstorage.Model.Member;
import marsparkdream.parkingstorage.Model.dto.MemberDto;
import marsparkdream.parkingstorage.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestApplicationTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void saveMemberInfo () {
        // given
        MemberDto memberInfo = MemberDto.memberDtoBuilder().address("보라매").name("이어진").build();
        Member member = memberInfo.toEntity();

        Member save = memberRepository.save(member);
        // then
        assertNotNull(save);
    }
}