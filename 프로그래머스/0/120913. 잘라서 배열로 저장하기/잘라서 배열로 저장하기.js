function solution(my_str, n) {
    var answer = [];
    let index = 0;
    for(let i = 0; i < my_str.length; i+=n){
        answer[index] = my_str.slice(i, i + n);
        index++;
    }
    return answer;
}