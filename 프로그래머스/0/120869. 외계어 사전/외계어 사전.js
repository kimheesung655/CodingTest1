function solution(spell, dic) {
    let str = spell.sort().join("");
    
    for (word of dic) {
        if (word.split("").sort().join("") === str) {
            return 1;
        }
    }
    
    return 2;
}