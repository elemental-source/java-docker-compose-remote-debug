package br.com.rbarbioni.sample.repository;

import br.com.rbarbioni.sample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by renanbarbioni on 08/06/17.
 */
public interface UserRepository extends JpaRepository<User, Long>{}