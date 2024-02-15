package br.com.project2.relacionamento.entities.Comment;

import br.com.project2.relacionamento.entities.Post.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity(name = "Comment")
@Table(name = "comments")
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String content;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    public Comment(CommentRequestDTO data) {
        this.author = data.author();
        this.content = data.content();
        this.post = data.post();
    }
}














