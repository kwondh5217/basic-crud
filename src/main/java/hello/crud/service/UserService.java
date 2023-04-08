package hello.crud.service;


import hello.crud.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final MemberRepository memberRepository;


}
