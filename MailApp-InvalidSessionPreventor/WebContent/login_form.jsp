<%@page isELIgnored="false" %>


<h1 style="color:red;text-align:center">Login Page</h1>

  <span style="color:red;text-align:center">${errorMsg} </span>
<form action="loginurl"  method="POST">
    username :: <input type="text"  name="uname"><br>
    Password :: <input type="password"  name="pwd"><br>
    <input type="submit"  value="register">
</form>