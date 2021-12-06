import { Component, OnInit } from '@angular/core';
import { BlogPost } from '../blog-post';
import { BlogPostService } from '../blog-post.service';

@Component({
  selector: 'app-blogpost-list',
  templateUrl: './blogpost-list.component.html',
  styleUrls: ['./blogpost-list.component.css']
})

// BlogpostListComponent uses blogpostservice to fetch all the entities persisted in the db and stores them in the blogPosts field
export class BlogpostListComponent implements OnInit {

  blogPosts!: BlogPost[];

  constructor(private blogPostService: BlogPostService) { }

  ngOnInit(): void {
    this.blogPostService.findAll().subscribe(data => {
      this.blogPosts = data;
    });
  }

}
