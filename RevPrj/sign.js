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
*/
function SaveLName(){
        localStorage.name.getElementById('lname').value;
}


function store(){
   
    var inputFName = document.getElementById("fname");
    localStorage.setItem("fname", inputFName.value);

    var inputMName = document.getElementById("mname");
    localStorage.setItem("mname", inputMName.value);

    var inputLName = document.getElementById("lname");
    localStorage.setItem("lname", inputLName.value);

    var inputFemale = document.getElementById("female");
    localStorage.setItem("female", inputFemale.value);

    var inputMale = document.getElementById("male");
    localStorage.setItem("male", inputMale.value);

    var inputOther = document.getElementById("others");
    localStorage.setItem("others", inputOther.value);

    var inputAge = document.getElementById("age");
    localStorage.setItem("age", inputAge.value);

    var inputPhone = document.getElementById("phone");
    localStorage.setItem("phone", inputPhone.value);

    var inputEmail = document.getElementById("email");
    localStorage.setItem("email", inputEmail.value);

    var inputAd1 = document.getElementById("adl1");
    localStorage.setItem("adl1", inputAd1.value);

    var inputAd2 = document.getElementById("adl2");
    localStorage.setItem("adl2", inputAd2.value);

    var inputzipcode = document.getElementById("zipcode");
    localStorage.setItem("zipcode", inputzipcode.value);

    var inputCity = document.getElementById("city");
   localStorage.setItem("city", inputCity.value);


   var inputState = document.getElementById("state");
   localStorage.setItem("state", inputState.value);

    var inputCountry = document.getElementById("country");
    localStorage.setItem("country", inputCountry.value);

    
    
    if (document.getElementById('fname').value == document.getElementById('lname').value)
{       
alert('first name and last name cannot  match!');
         return false;
     }
    else {
         return true;
}

}


 /* this is the signin form that takes you to the game page */
    function check(form){
        if(form.Admin.value == "Admin" && form.Password123.value =="Password123"){
            window.open('game.html')
        }
        else{
            alert("Error Username or Password incorrect")
        }
    }

   
    
   
   
    
    