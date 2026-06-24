function solution(array, commands) {
    var answer = [];
    for (let c = 0; c < commands.length; c++) {
        let i = commands[c][0];
        let j = commands[c][1];
        let k = commands[c][2];
        let arr = array.slice(i - 1, j);
        arr.sort((a, b) => a - b);
        answer.push(arr[k - 1]);
    }
    return answer;
}