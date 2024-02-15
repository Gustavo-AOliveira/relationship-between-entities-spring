package br.com.project2.relacionamento.service;

import br.com.project2.relacionamento.entities.Post.Post;
import br.com.project2.relacionamento.entities.Post.PostRequestDTO;
import br.com.project2.relacionamento.entities.Post.PostResponseDTO;
import br.com.project2.relacionamento.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostRepository repository;
    public PostService(PostRepository repository) {
        this.repository = repository;
    }
    public Post savePost(PostRequestDTO data){
        var post = new Post(data);
            return repository.save(post);
    }
    public List<PostResponseDTO> listAll(){
        List<PostResponseDTO> listPost = repository.findAll().stream().map(PostResponseDTO::new).toList();
            return listPost;
    }


}
