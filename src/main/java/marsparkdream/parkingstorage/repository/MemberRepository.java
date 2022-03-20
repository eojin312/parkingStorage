package marsparkdream.parkingstorage.repository;

import marsparkdream.parkingstorage.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}