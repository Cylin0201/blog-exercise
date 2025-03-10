package cylin0201.blog_exercise.dto;

import cylin0201.blog_exercise.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private  String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

    //toEntity()는 빌더 패턴을 사용하여 DTO를 엔티티로 만들어주는 메서드이다.
    //추후에 블로그 글을 추가할 때 저장할 엔티티로 변환하는 용도로 사용된다.
}
