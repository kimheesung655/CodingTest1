function solution(arr) {
    let numArr = [];
    for(let i = 0; i < arr.length; i++){
        if(arr[i] === 2){
            numArr.push(i);
        }
    }
    if(numArr.length === 0){
        return [-1];
    }
    let answer = arr.slice(numArr[0], (numArr[numArr.length - 1]) + 1)
    return answer;
}