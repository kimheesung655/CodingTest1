function solution(n) {
    let str = n.toString(3);
    let strRe = str.split("").reverse().join("");
    let answer = parseInt(strRe, 3);
    return answer;
}