package com.campos.brainamplified.services;

import com.campos.brainamplified.dao.IBlogPostRepo;
import com.campos.brainamplified.models.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogPostService {
    IBlogPostRepo  blogPostRepo;

    @Autowired
    public BlogPostService(IBlogPostRepo blogPostRepo)
    {
        this.blogPostRepo = blogPostRepo;
    }

    public BlogPost addEditBlogPost(BlogPost blogPost)
    {
        return blogPostRepo.save(blogPost);
    }

    public Optional<BlogPost> getBlogPostById(Long id)
    {
        return blogPostRepo.findById(id);
    }
}
