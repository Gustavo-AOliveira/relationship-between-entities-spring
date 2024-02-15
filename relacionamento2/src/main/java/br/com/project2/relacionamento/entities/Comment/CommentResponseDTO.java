package br.com.project2.relacionamento.entities.Comment;

import br.com.project2.relacionamento.entities.Post.Post;
import br.com.project2.relacionamento.entities.Post.PostResponseDTO;

public record CommentResponseDTO(
        Integer id,
        String author,
        String content,
        PostResponseDTO post
) {
    public CommentResponseDTO(Comment comment) {
        this(comment.getId(), comment.getAuthor(), comment.getContent(),new PostResponseDTO(comment.getPost()));
    }


}
