<%--
  Created by IntelliJ IDEA.
  User: Ian
  Date: 13/10/2017
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
    <link rel="stylesheet" href="assets/css/s.css">
    <link rel="stylesheet" href="plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="plugins/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="plugins/font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container">
    <div class="container-fluid">
    </div>
    <div class="row">
        <div class="panel panel-primary">
            <div class="panel-body">
                <form method="POST" action="#" role="form">
                    <div class="form-group">
                        <h2>Create account</h2>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupName">Username</label>
                        <input id="signupName" type="text" maxlength="50" class="form-control"  placeholder="Username" required autofocus>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupEmail">Email</label>
                        <input id="signupEmail" type="email" maxlength="50" class="form-control"  placeholder="Email" required autofocus>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupEmailagain">Email again</label>
                        <input id="signupEmailagain" type="email" maxlength="50" class="form-control"  placeholder="Email" required autofocus>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupPassword">Password</label>
                        <input id="signupPassword" type="password" maxlength="25" class="form-control" placeholder="Password" length="40" required autofocus>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupPasswordagain">Password again</label>
                        <input id="signupPasswordagain" type="password" maxlength="25" class="form-control" placeholder="Retype Password" required autofocus>
                    </div>
                    <div class="form-group">
                        <button id="signupSubmit" type="submit" class="btn btn-info btn-block">Create your account</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
