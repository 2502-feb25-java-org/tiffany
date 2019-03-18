/*Return the nth fibonacci number

f(0) = 0 f(1) = 1 f(10) = 55

challenge.fibonacci = function(n){ //code

};

*/



function fib(n)
{if (n <1 ) return 0; 
    if(n <=2) return 1; 
        return fib (n-1)+ fib(n-2)}