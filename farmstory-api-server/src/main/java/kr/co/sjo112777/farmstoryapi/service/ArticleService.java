package kr.co.sjo112777.farmstoryapi.service;

import kr.co.sjo112777.farmstoryapi.dto.ArticleDTO;
import kr.co.sjo112777.farmstoryapi.dto.PageRequestDTO;
import kr.co.sjo112777.farmstoryapi.dto.PageResponseDTO;

public interface ArticleService {

    public int register(ArticleDTO articleDTO);

    public PageResponseDTO<ArticleDTO> list(PageRequestDTO pageRequestDTO);
    public ArticleDTO get(int no);
    public void modify(ArticleDTO articleDTO);
    public void remove(int no);

}
