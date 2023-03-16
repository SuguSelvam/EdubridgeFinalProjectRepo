package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Software;

//whenevr i interact with db // @REPOSITORY
@Repository
public interface SoftwareRepo extends JpaRepository<Software, Integer> {
	

}