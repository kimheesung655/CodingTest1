function solution(n, m) {
    var answer = [];
    let mul = n * m;
    while(n%m!==0){
        let r = n % m;
        n = m;
        m = r;
    }
    answer.push(m);
    answer.push(mul / m);
    return answer;
}