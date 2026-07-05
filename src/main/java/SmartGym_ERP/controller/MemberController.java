package SmartGym_ERP.controller;

import SmartGym_ERP.entity.Member;
import SmartGym_ERP.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin // Frontend එකයි Backend එකයි අතර ප්‍රශ්නයක් නැතුව දත්ත හුවමාරු වෙන්න මේක උදව් වෙනවා
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 1. Frontend එකෙන් දත්ත ආවාම Database එකට යවන්න (POST Request)
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    // 2. Database එකේ තියෙන ඔක්කොම දත්ත Frontend එකට යවන්න (GET Request)
    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}