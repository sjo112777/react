package kr.co.sjo112777.farmstoryapi.repository;

import kr.co.sjo112777.farmstoryapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


}
