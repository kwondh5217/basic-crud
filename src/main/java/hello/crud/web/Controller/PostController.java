package hello.crud.web.Controller;


import hello.crud.service.PostService;
import hello.crud.web.dto.PostSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @GetMapping("/new/post")
    public String newPost(){
        return "new-post";
    }


    @PostMapping("/new/post")
    public String redirect(@ModelAttribute PostSaveRequestDto requestDto){
        postService.save(requestDto);
        return "index";
    }


}
