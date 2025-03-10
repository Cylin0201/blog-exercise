package cylin0201.blog_exercise.service;

import cylin0201.blog_exercise.domain.Article;
import cylin0201.blog_exercise.dto.AddArticleRequest;
import cylin0201.blog_exercise.repository.BlogRepository;
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

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
}
