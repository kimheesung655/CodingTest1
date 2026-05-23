function solution(s) {
    var answer = '';
    
    for (let i = 0; i < s.length; i++) {
        const ch = s.charAt(i); 
        if (s.indexOf(ch) === s.lastIndexOf(ch)) {
            answer += ch;
        }
    }
    return answer.split('').sort().join('');
}