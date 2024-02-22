package br.com.project2.relacionamento.entities.Comment;

import br.com.project2.relacionamento.entities.Post.Post;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CommentRequestDTO(

        @NotBlank
        String author,
        @NotBlank
        String content,
        @NotNull
        Post post
) {
}
