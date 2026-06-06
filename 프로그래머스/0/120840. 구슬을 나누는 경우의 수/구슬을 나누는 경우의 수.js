function solution(balls, share) {
    var answer = 0;
    let numerator1 = 1n;
    let numerator2 = 1n;
    let denominator = 1n;
    for(let i = 1; i <= balls - share; i++){
        numerator1 *= BigInt(i);
    }
    for(let i = 1; i <= share; i++){
        numerator2 *= BigInt(i);
    }
    for(let i = 1; i <= balls; i++){
        denominator *= BigInt(i);
    }
    answer = denominator / (numerator1 * numerator2)
    return answer;
}