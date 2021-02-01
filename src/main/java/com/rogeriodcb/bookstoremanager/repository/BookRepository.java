package com.rogeriodcb.bookstoremanager.repository;

import com.rogeriodcb.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{
	
}


