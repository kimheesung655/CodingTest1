function solution(str_list) {
    var answer = [];
    let l_index = str_list.indexOf("l");
    let r_index = str_list.indexOf("r");
    if (l_index === -1) l_index = Infinity;
    if (r_index === -1) r_index = Infinity;
        if(l_index < r_index){
            for(let i = 0; i <  l_index; i++){
                answer.push(str_list[i]);
            }   
        }else {
            for(let i = r_index+1; i < str_list.length; i++){
                answer.push(str_list[i]);
            }
        }
        if(!str_list.includes("r") || !str_list.includes("l")){
            return answer;
        }
    return answer;
}