function solution(s){
    let arr = [];
    for(let i = 0; i < s.length; i++){
        let ch = s.charAt(i);
        if(ch === '('){
            arr.push(ch);
        }else{
            if(arr.length == 0){
                return false;
            }
            arr.pop();
        }
    }
    return arr.length === 0;
}