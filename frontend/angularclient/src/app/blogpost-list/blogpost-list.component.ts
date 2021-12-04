import { Component, OnInit } from '@angular/core';
import { BlogPost } from '../blog-post';
import { BlogPostService } from '../blog-post.service';

@Component({
  selector: 'app-blogpost-list',
  templateUrl: './blogpost-list.component.html',
  styleUrls: ['./blogpost-list.component.css']
})
export class BlogpostListComponent implements OnInit {

  blogPosts!: BlogPost[];

  constructor(private blogPostService: BlogPostService) { }

  ngOnInit(): void {
    this.blogPostService.findAll().subscribe(data => {
      this.blogPosts = data;
    });
  }

}
