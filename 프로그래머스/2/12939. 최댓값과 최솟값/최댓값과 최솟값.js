function solution(s) {
    let answer = s.split(" ");
    let max = Number(answer[0]);
    let min = Number(answer[0]);
    for(let i = 0; i < answer.length; i++){
        if(Number(answer[i]) > max){
            max = Number(answer[i]);
        }
    }
    for(let i = 0; i < answer.length; i++){
        if(Number(answer[i]) < min){
            min = Number(answer[i]);
        }
    }
    return min+" "+max;
}