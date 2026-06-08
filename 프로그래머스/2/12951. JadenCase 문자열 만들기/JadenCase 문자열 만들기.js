function solution(s) {
    let str = s.toLowerCase().split(" ");
    for(let i = 0; i < str.length; i++){
        if(str[i] !== ""){
            str[i] = str[i][0].toUpperCase() + str[i].slice(1);
        }
    }
    return str.join(" ");
}