package br.com.project2.relacionamento.entities.Post;

import br.com.project2.relacionamento.entities.Comment.Comment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Post")
@Table(name = "posts")
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    public Post(PostRequestDTO data) {
        this.title = data.title();
        this.content = data.content();
    }
}














