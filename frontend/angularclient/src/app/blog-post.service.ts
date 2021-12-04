import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { BlogPost } from './blog-post';
import { Observable } from 'rxjs';

// @Injectable() metadata marker. This signals that the service should be created and injected via Angular's dependency injectors.
@Injectable({
  providedIn: 'root'
})
export class BlogPostService {

  private blogsUrl!: string;

  constructor(private http: HttpClient) {
    this.blogsUrl = 'http://localhost:8080/testblog';
   }

   public findAll(): Observable<BlogPost[]> {
     return this.http.get<BlogPost[]>(this.blogsUrl);
   }

   public save(blogPost: BlogPost) {
     return this.http.post<BlogPost>(this.blogsUrl, blogPost);
   }
}