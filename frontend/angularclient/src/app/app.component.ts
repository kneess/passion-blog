import { Component } from '@angular/core';

@Component({
  // selector – the HTML selector used to bind the component to the HTML template file
  selector: 'app-root',
  // templateUrl – the HTML template file associated with the component
  templateUrl: './app.component.html',
  // styleUrls – one or more CSS files associated with the component
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularclient';
}
