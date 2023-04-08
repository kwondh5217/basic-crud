package hello.crud.domain;


import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "member")
    private List<UserPost> userPosts = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Comment> comments = new ArrayList<>();


}
