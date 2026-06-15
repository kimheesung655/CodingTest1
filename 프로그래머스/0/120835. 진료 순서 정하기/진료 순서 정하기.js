function solution(emergency) {
    let sorted = emergency.slice();
    sorted.sort((a, b) => b - a);
    let answer = [];
    for(let i = 0; i < emergency.length; i++){
        answer.push(sorted.indexOf(emergency[i]) + 1);
    }
    return answer;
}