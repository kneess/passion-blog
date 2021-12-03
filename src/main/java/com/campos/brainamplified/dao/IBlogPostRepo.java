package com.campos.brainamplified.dao;

import com.campos.brainamplified.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogPostRepo extends JpaRepository<BlogPost, Long> {

}
