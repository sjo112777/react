package kr.co.sjo112777.farmstoryapi.repository;

import kr.co.sjo112777.farmstoryapi.dto.ArticleDTO;
import kr.co.sjo112777.farmstoryapi.entity.Article;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    @Test
    public void test1(){

        List<Article> articles = articleRepository.findAll();

        List<ArticleDTO> dtoList = articles.stream().map((entity)-> {
            ArticleDTO dto = modelMapper.map(entity, ArticleDTO.class);
            dto.setWriter(entity.getWriter().getNick());

            return dto;
        }).toList();

        System.out.println(articles);
    }



}