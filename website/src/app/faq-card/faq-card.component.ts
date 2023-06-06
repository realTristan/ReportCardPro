import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-faq-card',
  templateUrl: './faq-card.component.html',
  styleUrls: ['./faq-card.component.css']
})
export class FaqCardComponent {
  @Input() question: string | undefined;
  @Input() answer: string | undefined;
}
