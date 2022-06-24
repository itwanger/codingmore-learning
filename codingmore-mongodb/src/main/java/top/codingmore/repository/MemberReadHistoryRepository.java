package top.codingmore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.codingmore.model.MemberReadHistory;

import java.util.List;

public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    List<MemberReadHistory> findByMemberIdOrderByCreateDateDesc(Long memberId);
}
