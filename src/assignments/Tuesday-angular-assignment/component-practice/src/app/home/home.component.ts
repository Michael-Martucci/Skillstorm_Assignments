import { Component, OnInit } from '@angular/core';
import { employee } from '../models/employee';
import { CommonModule } from '@angular/common';




@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {

  employees: employee[] = [];

  constructor() {}

  ngOnInit(): void {
    this.employees = [
      new employee('111', 'John Smith', '02-19-1990', 'admin', '22.00'),
      new employee('112', 'Mary Johnson', '05-10-2000', 'supervisor', '35.00'),
      new employee('113', 'Mark Jackson', '08-26-1992', 'accounting', '28.00'),
      new employee('113', 'Susan Summers', '12-23-1998', 'purchasing', '28.00')
    ];
  }

}
