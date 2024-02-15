package br.com.project2.relacionamento.controller;

import br.com.project2.relacionamento.entities.Comment.CommentResponseDTO;
import br.com.project2.relacionamento.entities.Post.PostRequestDTO;
import br.com.project2.relacionamento.entities.Post.PostResponseDTO;
import br.com.project2.relacionamento.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity savePost(@RequestBody @Valid PostRequestDTO data){
        var post = postService.savePost(data);
            return ResponseEntity.status(HttpStatus.OK).body(new PostResponseDTO(post));
    }

    @GetMapping
    public ResponseEntity listComments(){
        List<PostResponseDTO> responseDTOList = postService.listAll();
            return ResponseEntity.ok().body(responseDTOList);
    }


}










