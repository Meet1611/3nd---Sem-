let username = document.getElementById('name');
let pass = document.getElementById('pass');
let cpass = document.getElementById('cpass');
let email = document.getElementById('email');
let btn = document.getElementById('submit');

btn.addEventListener('click', (event) => {
    console.log(username.value);    
    if (validate()) {
        alert("Form Submitted Successfully");
    }
    else {
        alert("Form not submitted");
    }
    // event.preventDefault();
});

function validate() {
    if (username.value == "") {
        alert("Please enter your name");

        return false;
    }
    if (pass.value == "") {
        alert("Please enter your password");
        return false;
    }
    if (email.value == "") {
        alert("Please enter your email");
        return false;
    }

    // let pattern1 = /^[A-Za-z][A-Za-z0-9_]{7,29}$/;
    let pattern2 = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])[A-Za-z\d@.#$!%*?&]{8,15}$/;
    let pattern3 = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    // let regex = new RegExp(pattern1);
    let regex2 = new RegExp(pattern2);
    let regex3 = new RegExp(pattern3);

    // if (!regex.test(username.value)) {
    //     alert("Please enter a valid name");
    //     return false;
    // }
    if (!regex2.test(pass.value)) {
        alert("Please enter a valid password");
        return false;
    }
    if (!regex3.test(email.value)) {
        alert("Please enter a valid email");
        return false;
    }


    return true;

}