package kr.co.sjo112777.farmstoryapi.service;

import kr.co.sjo112777.farmstoryapi.dto.TermsDTO;
import kr.co.sjo112777.farmstoryapi.dto.UserDTO;

public interface UserService {


    public String register(UserDTO userDTO);

    public TermsDTO terms();
}
