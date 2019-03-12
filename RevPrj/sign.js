/*function setStyles(){

    var signUpForm = localStorage.getItem('sign-up-form');
}   var name = localStorage.getItem('name');
    var gender = localStorage.getItem('gender');
    var phone = localStorage.getItem('phone');
    var email = localStorage.getItem('email');

    document.getElementById('sign-up-form').value = signUpForm;
    document.getElementById('gender').value = gender;
    document.getElementById('phone').value = phone;
    document.getElementById('email').value = email;
    */

  /* 
    function saveName(){
    localStorage.name=document.getElementById("name").value;

   
}
function SaveLName(){
        localStorage.name.getElementById('lname').value;
}
*/

function store(){
   
    var inputFName = document.getElementById("fname");
    localStorage.setItem("fname", inputFName.value);

    var inputLName = document.getElementById("lname");
    localStorage.setItem("lname", inputLName.value);

    var inputFemale = document.getElementById("female");
    localStorage.setItem("female", inputFemale.value);

    var inputMale = document.getElementById("male");
    localStorage.setItem("male", inputMale.value);

    var inputOther = document.getElementById("others");
    localStorage.setItem("others", inputOther.value);

    var inputPhone = document.getElementById("phone");
    localStorage.setItem("phone", inputPhone.value);

    var inputEmail = document.getElementById("email");
    localStorage.setItem("email", inputEmail.value);
}