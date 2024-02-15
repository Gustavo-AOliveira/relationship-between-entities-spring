package br.com.project2.relacionamento.controller;

import br.com.project2.relacionamento.entities.Comment.Comment;
import br.com.project2.relacionamento.entities.Comment.CommentRequestDTO;
import br.com.project2.relacionamento.entities.Comment.CommentResponseDTO;
import br.com.project2.relacionamento.entities.Post.PostResponseDTO;
import br.com.project2.relacionamento.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
        private CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @PostMapping
    public ResponseEntity saveComment(@RequestBody @Valid CommentRequestDTO data){
        var comment = commentService.saveComment(data);
            return ResponseEntity.ok().body(new CommentResponseDTO(comment));
    }

    @GetMapping
    public ResponseEntity listComments(){
        List<CommentResponseDTO> commentsList = commentService.listAll();
            return ResponseEntity.ok().body(commentsList);
    }
}













