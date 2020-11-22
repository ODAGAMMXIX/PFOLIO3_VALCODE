import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { TemplateModule } from './template/template.module';
import { HomeComponent } from './home/home.component';
import { TransacoesModule } from './transacoes/transacoes.module';
import { TransacoesService } from './transacoes.service'

@NgModule({
  declarations: [

    AppComponent,
    HomeComponent,

  ],
  imports: [

    BrowserModule,
    HttpClientModule,

    AppRoutingModule,
    TemplateModule,
    TransacoesModule

  ],
  providers: [

    TransacoesService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
