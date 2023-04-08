package hello.crud.web.dto;


import hello.crud.domain.Post;
import hello.crud.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostSaveRequestDto {


    private Member member;
    private String title;
    private String content;

    @Builder
    public PostSaveRequestDto(Member member, String title, String content) {
        this.member = member;
        this.title = title;
        this.content = content;
    }

    public Post toEntity(){
        return Post.builder()
                .member(member)
                .title(title)
                .content(content)
                .build();
    }
}
