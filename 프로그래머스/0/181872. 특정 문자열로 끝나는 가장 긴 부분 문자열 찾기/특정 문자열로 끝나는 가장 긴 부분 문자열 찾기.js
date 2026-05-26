function solution(myString, pat) {
    let last = myString.lastIndexOf(pat);
    return myString.slice(0, last + pat.length);
}