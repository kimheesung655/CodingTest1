function solution(my_string) {
    let answer = Array(52).fill(0);
    for(let x of my_string){
        let code = x.charCodeAt(0);
        if (code >= 65 && code <= 90) {
            // 대문자 (A=65 ~ Z=90) -> 0번 ~ 25번 인덱스에 매핑
            answer[code - 65]++;
        } else if (code >= 97 && code <= 122) {
            // 소문자 (a=97 ~ z=122) -> 26번 ~ 51번 인덱스에 매핑
            answer[code - 97 + 26]++;
        }
    }
    return answer;
}