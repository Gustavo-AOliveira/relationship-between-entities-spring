package br.com.project2.relacionamento.entities.Post;

import jakarta.validation.constraints.NotBlank;

public record PostRequestDTO(

        @NotBlank
        String title,

        @NotBlank
        String content
) {
}
