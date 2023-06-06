import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LaptopComponent } from './laptop/laptop.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NavbarButtonComponent } from './navbar-button/navbar-button.component';
import { FaqCardComponent } from './faq-card/faq-card.component';

@NgModule({
  declarations: [
    AppComponent,
    LaptopComponent,
    NavbarComponent,
    NavbarButtonComponent,
    FaqCardComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
