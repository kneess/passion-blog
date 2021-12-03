package com.campos.brainamplified.controllers;

import com.campos.brainamplified.models.BlogPost;
import com.campos.brainamplified.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BlogPostController {
    BlogPostService blogPostService;
    @Autowired
    public BlogPostController(BlogPostService blogPostService)
    {
        this.blogPostService = blogPostService;
    }

    @GetMapping("/test")
    public String postBlog()
    {
        BlogPost post = new BlogPost("das;klf","a;djsf","d;ljf");
        blogPostService.addEditBlogPost(post);
        return "postBlog()";
    }

    @GetMapping("/testblog")
    public Optional<BlogPost> getBloh()
    {
        return blogPostService.getBlogPostById(1l);

    }

    @PostMapping("/testblog")
    public String postBlogger(@RequestBody BlogPost blogPost, Model model)
    {
        blogPostService.addEditBlogPost(blogPost);
        return "Posted";
    }
}
