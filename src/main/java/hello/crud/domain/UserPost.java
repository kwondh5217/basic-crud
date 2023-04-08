package hello.crud.domain;


import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class UserPost {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_post_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
