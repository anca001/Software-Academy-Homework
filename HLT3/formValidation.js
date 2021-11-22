const name = document.getElementById('name')
const nameAlert = document.getElementById('nameAlert')
const email = document.getElementById('email')
const emailAlert =document.getElementById('emailAlert')
const password = document.getElementById('password')
const passwordAlert = document.getElementById('passwordAlert')
const passwordconfirm = document.getElementById('passwordconfirm')
const passwordconfirmAlert = document.getElementById('passwordconfirmAlert')
const country = document.getElementById('country')
const countryAlert = document.getElementById('countryAlert')
const teacher = document.getElementById('teacher')
const student = document.getElementById('student')
const acctypeAlert = document.getElementById('acctypeAlert')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')

/* Check for empty fields when Register button is clicked and prompt user to enter mandatory details */
form.addEventListener('submit', (e) => {
    e.preventDefault()
    if (name.value === '' || name.value == null) {
        nameAlert.textContent = 'Please enter your name';
    }

    if (email.value === '' || email.value == null) {
        emailAlert.textContent = "Please enter your email address";
    }

    if (password.value === '' || password.value == null) {
        passwordAlert.textContent = "Please choose a password";
    }

    if (passwordconfirm.value === '' || passwordconfirm.value == null) {
        passwordconfirmAlert.textContent = "Please repeat password";
    }

    if (!teacher.checked && !student.checked) {
        acctypeAlert.textContent = "Please check one";
    } 

})