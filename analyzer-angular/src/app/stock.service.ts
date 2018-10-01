import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable()
export class StockService {

  private stocksUrl = 'api/heroes';  // URL to web api
  constructor(private http: HttpClient) { }


}
