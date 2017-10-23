<html>
<head>
    <title>Login Form</title>
    <link rel = "stylesheet" href="assets/css/normalize.css">
    <link rel = "stylesheet" href="plugins/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel = "stylesheet" href="plugins/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <link rel = "stylesheet" href="plugins/font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="panel panel-primary" style="max-width: 300px; margin: auto auto; margin-top: 20px;">
        <div class="panel-heading">
            <h3 class ="panel-title">Login</h3>
        </div>
        <form method ="post" action="/login">
            <div class="panel-body">
                <div class ="input-group">
                    <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i> </span>
                    <input type="text" class="form-control" name="username" placeholder="username" required>
                </div>
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-key" aria-hidden="true"></i> </span>
                    <input type="password" class="form-control" name="password" placeholder="password" required>
                </div>

                </br>
                <button type="submit" class="btn btn-primary" style="display: block; margin: auto auto;">Login
                </button>

            </div>
        </form>

    </div>
</div>
</body>
</html>
