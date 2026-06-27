function solution(my_string) {
    var answer = my_string.split(/[a-zA-Z]+/);
    var sum = 0;
    for(x of answer){
        if(!(x === ' ')){
            sum += Number(x);
        }
    }
    return sum;
}