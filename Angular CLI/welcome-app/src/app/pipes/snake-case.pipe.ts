import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
 name: 'snakeCase'
})
export class SnakeCasePipe implements PipeTransform {
    transform(value: string, limit:number): string {
     
        var replaced = value.split(' ').join('_').substr(0, limit);
        
        return replaced;
    }
}