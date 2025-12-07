package com.sahil.spring_boot_kickoff.repository;
import com.sahil.spring_boot_kickoff.model.HelloMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepo extends JpaRepository<HelloMessage,Integer>{
}
