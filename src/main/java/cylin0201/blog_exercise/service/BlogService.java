package cylin0201.blog_exercise.service;

import cylin0201.blog_exercise.domain.Article;
import cylin0201.blog_exercise.dto.AddArticleRequest;
import cylin0201.blog_exercise.dto.UpdateArticleRequest;
import cylin0201.blog_exercise.repository.BlogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public Article findByID(long id){
        return blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found: " + id));
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());
        return article;
    }
}
