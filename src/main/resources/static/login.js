document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('signupForm');
  if (!form) return;

  form.addEventListener('submit', async function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value.trim();
    const email    = document.getElementById('email').value.trim();
    const password = document.getElementById('password').value.trim();

    try {
      const response = await fetch('http://localhost:8080/api/auth/signup', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, email, password })
      });

      const data = await response.json();

      if (response.ok) {
        alert("✅ Signup successful!");
        window.location.href = "dashboard.html"; // forward to dashboard
      } else {
        alert("❌ " + (data.message || "Signup failed!"));
      }
    } catch (error) {
      alert("❌ Server error: " + error.message);
    }
  });
});
