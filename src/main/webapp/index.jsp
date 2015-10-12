<html>
<head>
    <meta charset="utf-8"/>
    <title>Geely CSP Admin</title>
    <meta name="description" content="Geely CSP Admin" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=request.getContextPath() %>/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style type="text/css">
    	html,body {
    		margin: 0px;
    		padding: 0px;
    		border:0px;
    		font-family: "微软雅黑";
    	}
    	
    	.list-group-item:first-child {
    		border-radius: 0px;
    	}
	    .list-group-item:last-child {
    		border-radius: 0px;
    	}
    </style>
</head>
<body>
<nav class="navbar" style="margin:0px;padding:0px;border: 0px; border-radius: 0px;min-height: 45px;">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Brand</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="main-container container-fluid">
	<div class="row">
		<div class="col-md-2" style="padding: 0px;">
			<ul id="nav" class="nav">
                
            </ul>
		</div>
  		<div class="col-md-10" style="background-color: #f3f3f3;min-height: 100%;">
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">
					  <li><a href="#">Home</a></li>
					  <li><a href="#">Library</a></li>
					  <li class="active">Data</li>
					</ol>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<!-- 
					<a href="#/test">test</a>
					<div ng-view>
					
					</div> -->
                    <div class="page-header">
                        <h1>Example page header <small>Subtext for header</small></h1>
                    </div>
				</div>
			</div>
  		</div>
	</div>
</div>
</body>
<script data-main="main" src="<%=request.getContextPath() %>/bower_components/requirejs/require.js"></script>
</html>
