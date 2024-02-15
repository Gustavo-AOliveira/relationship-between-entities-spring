package br.com.project2.relacionamento.service;

import br.com.project2.relacionamento.entities.Comment.Comment;
import br.com.project2.relacionamento.entities.Comment.CommentRequestDTO;
import br.com.project2.relacionamento.entities.Comment.CommentResponseDTO;
import br.com.project2.relacionamento.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public Comment saveComment(CommentRequestDTO data){
        var newComment = new Comment(data);
            return commentRepository.save(newComment);
    }
    public List<CommentResponseDTO> listAll(){
        List<CommentResponseDTO> commentList = commentRepository.findAll().stream().map(CommentResponseDTO::new).toList();
            return commentList;
    }
}
















