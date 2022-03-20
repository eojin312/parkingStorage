package marsparkdream.parkingstorage.service;

import lombok.RequiredArgsConstructor;
import marsparkdream.parkingstorage.Model.Member;
import marsparkdream.parkingstorage.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestApplication {

    private final MemberRepository memberRepository;

    private long save(Member member) {
        Member memberInfo = memberRepository.save(member);
        return memberInfo.getId();
    }

    private List<Member> findAll() {
        return memberRepository.findAll();
    }
}
