package br.com.project2.relacionamento.entities.Post;

public record PostResponseDTO(
        Integer id,
        String title,
        String content
) {
    public PostResponseDTO (Post post){
        this(post.getId(), post.getTitle(), post.getContent());
    }
}
