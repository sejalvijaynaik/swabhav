import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
 name: 'snakeCase'
})
export class SnakeCasePipe implements PipeTransform {
    transform(value: string, limit:number): string {
     
        var words:string[] = value.split(' ');
        var newValue:string;
        
        console.log(words.length);

        if(words.length <= limit){
            newValue = words.join("_");
        }   
        else{
            words = words.slice(0, 5);
            newValue = words.join("_");
        }
        return newValue;
    }
}