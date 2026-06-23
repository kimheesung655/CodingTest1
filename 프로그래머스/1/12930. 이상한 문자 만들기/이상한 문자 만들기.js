function solution(s) {
    var answer = '';
    let str = s.split("");
    let cnt = 0;
    for(let i = 0; i < str.length; i++){
        if(!(str[i] === " ")){
            if(cnt % 2 === 0){
                answer += s[i].toUpperCase();
                cnt++;
            }else{
                answer += s[i].toLowerCase();
                cnt++;
            }
        }else{
            answer += s[i];
            cnt = 0;
        }
    }
       
    return answer;
}