<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8"/>
    <title>TMP Geely CSP Admin</title>
    <meta name="description" content="Geely CSP Admin" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="<%=request.getContextPath() %>/bower_components/bootstrap/dist/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/bower_components/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet"/>
    <link href="<%=request.getContextPath() %>/bower_components/DataTables/media/css/jquery.dataTables.css" type="text/css" rel="stylesheet"/>
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
        .position-relative {
            position: relative;
            padding: 0 0 0 10px;
            margin:0;
            background-color: #ffffff;
            border-bottom: 1px solid #e5e5e5;
        }
        .header-buttons {
            display: inline-block;
            position: absolute;
            right:0;
            top:0;
            height: 100%;
        }
        .white-color-a {
            position: relative;
            color: white;
        }
        .badge {
            position: absolute;
            top: 6px;
            left: 4px;
            padding: 2px;
            cursor: pointer;
            background-color: transparent!important;
            color: #ffffff;
            border: 1px solid #fff;
            width: 18px;
            height: 18px;
            box-shadow: 1px 1px 0 #2dc3e8;
        }
        .sidebar-toggler {
            vertical-align: middle;
            display: inline-block;
            z-index: 1029;
            margin-right: 5px;
            padding: 8px 10px;
            color: #dfdfdf;
            -webkit-transition: all .218s ease;
            -moz-transition: all .218s ease;
            -o-transition: all .218s ease;
            transition: all .218s ease;
            height:100%;
            float: right;
        }
        .list-group-item {
            position: relative;
            display: block;
            padding: 10px 15px;
            margin-bottom: -1px;
            background-color: #fff;
            border-right:0;
            border-left: 0;
            border-top: 1px solid #f3f3f3;
        }
    </style>
</head>
<body ng-controller="indexController">
<nav class="navbar" style="margin:0;padding:0;border: 0; border-radius: 0;min-height: 45px;background-color:#2dc3e8;">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="color:white;font-weight:bold;">Geely CSP</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <span style="color:#ffffff;font-size:18px;line-height:53px;">Administrator</span>
                </li>
                <li>
                    <a href="#" class="white-color-a">
                        <i class="fa fa-envelope" style="font-size:23px;"></i>
                        <span class="badge">3</span>
                    </a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle white-color-a" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-user" style="font-size:23px;"></i><span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#" class='white-color-a'>账户设置</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#" class='white-color-a'>注销</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="main-container container-fluid">
	<div class="row">
		<div class="col-md-2" style="padding: 5px;box-shadow: 3px 0 7px rgba(0,0,0,.15);z-index:1;min-height:100%;">
			<ul menu-directive class="nav"></ul>
		</div>
  		<div class="col-md-10" style="background-color: #f3f3f3;">
			<div class="row" style="box-shadow: 0 3px 7px 0 rgba(0,0,0,.15);z-index: 1;position: relative;height:41px;">
				<div class="col-md-12">
					<ol class="breadcrumb" style="margin:0">
					  <li><a href="#">Home</a></li>
					  <li><a href="#">Library</a></li>
					  <li class="active">Data</li>
					</ol>
				</div>
			</div>
			<div class="row">
				<div class="page-header position-relative">
                    <div class="header-title">
                        <h1 style="padding: 0;margin: 0 4px;font-size: 17px;font-weight: lighter;color: #737373;line-height: 37px;display: inline-block;">
                            Admin 首页
                        </h1>
                    </div>
                    <!--Header Buttons-->
                    <div class="header-buttons">
                        <a class="sidebar-toggler" href="#">
                            <i class="glyphicon glyphicon-fullscreen" style="font-size: 17px;font-style: normal;font-weight: normal;line-height: 27px;"></i>
                        </a>
                        <a class="sidebar-toggler" href="#">
                            <i class="fa fa-arrows-h" style="font-size: 17px;font-style: normal;font-weight: normal;line-height: 27px;"></i>
                        </a>
                    </div>
                    <!--Header Buttons End-->
                </div>
			</div>
			<div class="row" style="background: #eee;padding: 18px 20px 24px;min-height: 90%;">
				<div class="col-md-12">
					<div ng-view>

					</div>
				</div>
			</div>
  		</div>
	</div>
</div>
</body>
<script data-main="main" src="<%=request.getContextPath() %>/bower_components/requirejs/require.js"></script>
</html>
