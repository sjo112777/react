package kr.co.sjo112777.farmstoryapi.repository;

import kr.co.sjo112777.farmstoryapi.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    public Page<Article> findByCate(String cate, Pageable pageable);



}
