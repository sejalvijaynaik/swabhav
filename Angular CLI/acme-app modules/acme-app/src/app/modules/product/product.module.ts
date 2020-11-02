import { NgModule } from '@angular/core';
import { SharedModule } from "../../modules/shared/shared.module";

import { ProductListComponent } from "../../components/product-list/product-list.component";
import { ProductDetailsComponent } from "../../components/product-details/product-details.component";
import { SearchComponent } from '../../components/search/search.component';

@NgModule({
  declarations: [ProductListComponent,
                  ProductDetailsComponent,
                  SearchComponent
                ],
  imports: [SharedModule]
})
export class ProductModule { }
