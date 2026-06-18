function solution(bin1, bin2) {
    let decimal1 = parseInt(bin1, 2);
    let decimal2 = parseInt(bin2, 2);
    let decSum = decimal1 + decimal2;
    return decSum.toString(2);
}