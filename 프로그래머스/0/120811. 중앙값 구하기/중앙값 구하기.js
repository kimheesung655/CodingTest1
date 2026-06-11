function solution(array) {
    let sortNum = array.sort((a, b) => a - b);
    return sortNum[parseInt(array.length/2)];
}