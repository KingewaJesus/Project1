// pro.js

const loginBtn = document.getElementById("loginBtn");
const signupBtn = document.getElementById("signupBtn");
const formTitle = document.getElementById("form-title");
const form = document.getElementById("form");
const nameField = document.getElementById("nameField");

// Switch to Login
loginBtn.addEventListener("click", () => {
  signupBtn.classList.remove("active");
  loginBtn.classList.add("active");

  formTitle.innerText = "Login";
  nameField.style.display = "none"; // hide name field
  form.querySelector(".submit-btn").innerText = "Login";
});

// Switch to Sign Up
signupBtn.addEventListener("click", () => {
  loginBtn.classList.remove("active");
  signupBtn.classList.add("active");

  formTitle.innerText = "Sign Up";
  nameField.style.display = "flex"; // show name field
  form.querySelector(".submit-btn").innerText = "Register";
});

// Toggle password visibility
const togglePass = document.querySelector(".toggle-pass");
const passwordInput = form.querySelector('input[type="password"]');

togglePass.addEventListener("click", () => {
  if (passwordInput.type === "password") {
    passwordInput.type = "text";
    togglePass.textContent = "🙈";
  } else {
    passwordInput.type = "password";
    togglePass.textContent = "👁️";
  }
});
