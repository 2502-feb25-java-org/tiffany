/*var firstName = prompt("What is your first name");
var lastName = prompt("What is your last name");
var age = prompt("What is your age");

console.log("Your name is " + firstName + " " + lastName) 
console.log("You are " + age +"  years old." )


// Get age and convert it to a Number (prompt always returns a String)
var age1 = Number(prompt("What is your age?"));
 
// If age is negative
if(age1 < 0) {
 console.log("Come back once you're out of the womb");
}
 */
/*
// If age is 21  
if(age1 === 21) {
 console.log("Happy 21st Birthday!");
}
 
// If age is odd
//(not evenly divisible by two)
if(age1 % 2 !== 0) {
 console.log("Your age is odd!");
}
 
// If age is a perfect square
if(age1 % Math.sqrt(age) === 0) {
  console.log("Your age is a perfect square!");
}
*/

/*
// create secret number
var secretNumber = 4;

// ask user for guess
var guess = Number(prompt("guess a number"));

//check guess
if((guess) === secretNumber){
    alert("You got it right!");
}
//otherwise, check if higher
else if((guess) > secretNumber){
    alert("too high. Guess again!");
}

//check if lower
else{
    alert("too low. guess again!");
}
*/

/* var num = 1

while(num <= 20) {
 if(num % 4 === 0){
   console.log(num);
 }
 num++;
}
*/
console.log("print all the numbers between -10 and 19")
var num1 = -10;

while (num1 <=19){
    console.log(num1)
    num1++  
} 

console.log("print all even numbers between 10 and 40")
var num2 = 10;
while(num2 <=40){
    if(num2 % 2 === 0){
        console.log(num2)
    }num2++
}

console.log("print all odd numbers between 10 and 40")
var num2 = 10;
while(num2 <=40){
    if(num2 % 2 === 1){
        console.log(num2)
    }num2++
}
console.log("print all even numbers between 10 and 40")
var num2 = 5;
while(num2 <=50){
    if(num2 % 5 === 0 && num2 % 3 ===0){
        console.log(num2)
    }num2++
}









