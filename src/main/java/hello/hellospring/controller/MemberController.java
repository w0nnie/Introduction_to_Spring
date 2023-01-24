package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //의존성주입 생성자주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
