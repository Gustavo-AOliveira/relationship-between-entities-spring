package br.com.project2.relacionamento.entities.Comment;

import br.com.project2.relacionamento.entities.Post.Post;
import jakarta.validation.constraints.NotBlank;

public record CommentRequestDTO(

        @NotBlank
        String author,
        @NotBlank
        String content,
        @NotBlank
        Post post
) {
}
