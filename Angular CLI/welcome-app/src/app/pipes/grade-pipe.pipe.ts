import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
 name: 'grade'
})
export class GradePipe implements PipeTransform {
    transform(value: number): string {
        
        if(value > 8){
            return value + 'A';
        }
        else if(value > 6){
            return value + 'B';
        }
        else if(value > 4){
            return value + 'C';
        }
        else if(value > 2){
            return value + 'BD';
        }
        else {
            return value + 'E';
        }
    }
}