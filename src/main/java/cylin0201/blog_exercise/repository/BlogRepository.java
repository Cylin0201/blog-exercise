package cylin0201.blog_exercise.repository;

import cylin0201.blog_exercise.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
    //JpaRepository 클래스를 상속받을 때 엔티티 Article과 엔티티의 기본키 타입 Long을 인수로 넣는다.
    //이 리포지토리를 사용할 때에는 JpaRepository에서 제공하는 여러 메소드를 이용할 수 있다.
}
