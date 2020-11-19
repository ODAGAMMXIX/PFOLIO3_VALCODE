import { Component, OnInit } from '@angular/core';
import { TransacoesService } from '../../transacoes.service';
import { Transacoes } from '../transacoes';

@Component({
  selector: 'app-transacoes-lista',
  templateUrl: './transacoes-lista.component.html',
  styleUrls: ['./transacoes-lista.component.css']
})
export class TransacoesListaComponent implements OnInit {

  transacoes: Transacoes[] = [];

  constructor(private service: TransacoesService) { }

  ngOnInit(): void {
    this.service
      .getTransacoes()
      .subscribe( resposta => this.transacoes = resposta );
  }

}
