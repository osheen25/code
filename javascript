// program 1: 1. Take a sentence as an input and reverse every word in that sentence. 
function wordsRev(string){
    return string.split('').reverse().join('');
  }
  console.log(wordsRev('This is a sunny day'));

//program 2: 2. Perform sorting of an array in descending order.
const nums = [45, 60, 33, 100, 12, 6];
nums.sort(function(a, b){return b-a});
