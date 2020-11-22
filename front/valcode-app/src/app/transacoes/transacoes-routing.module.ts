import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TransacoesFormComponent } from './transacoes-form/transacoes-form.component';
import { TransacoesListaComponent } from './transacoes-lista/transacoes-lista.component';

const routes: Routes = [
  { path:'transacoes-form', component: TransacoesFormComponent},
  { path:'transacoes-lista', component: TransacoesListaComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TransacoesRoutingModule { 

  
}
