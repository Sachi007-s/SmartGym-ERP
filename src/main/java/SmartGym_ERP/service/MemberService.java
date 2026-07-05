package SmartGym_ERP.service;

import SmartGym_ERP.entity.Member;
import SmartGym_ERP.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    // 1. අලුත් සාමාජිකයෙක්ව Database එකට Save කරන්න
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    // 2. දැනට ඉන්න ඔක්කොම සාමාජිකයන්ගේ ලිස්ට් එක ලබාගන්න
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}