<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

	<meta charset="utf-8" />

	<title>Metronic | Login Page</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/style-metro.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/style-responsive.css" rel="stylesheet" type="text/css"/>

	<link href="${pageContext.request.contextPath}/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

	<link href="${pageContext.request.contextPath}/css/uniform.default.css" rel="stylesheet" type="text/css"/>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

	<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css"/>

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="${pageContext.request.contextPath}/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="login">

	<!-- BEGIN LOGO -->

	<div class="logo">

		<%-- <img src="${pageContext.request.contextPath}/image/logo-big.png" alt="" />  --%>
		<h3 class="form-title">员工管理系统</h3>
	</div>

	<!-- END LOGO -->

	<!-- BEGIN LOGIN -->

	<div class="content">

		<!-- BEGIN LOGIN FORM -->
		<s:form action="employee_login" method="post" namespace="/" theme="simple" class="form-vertical login-form"> 

			<h4 class="form-title">欢迎登陆</h4>
			<h6><s:actionerror class="error"/></h6>

			<div class="alert alert-error hide">

				<button class="close" data-dismiss="alert"></button>

				<span>用户名和密码不能为空！</span>
				

			</div>

			<div class="control-group">

				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

				<label class="control-label visible-ie8 visible-ie9">Username</label>

				<div class="controls">

					<div class="input-icon left">

						<i class="icon-user"></i>
						<!-- <s:textfield class="m-wrap placeholder-no-fix" placeholder="Username" name="username"/>-->

						 <input class="m-wrap placeholder-no-fix" type="text" placeholder="Username" name="username"/>

					</div>

				</div>

			</div>

			<div class="control-group">

				<label class="control-label visible-ie8 visible-ie9">Password</label>

				<div class="controls">

					<div class="input-icon left">

						<i class="icon-lock"></i>
					<!--  	<s:password class="m-wrap placeholder-no-fix"  placeholder="Password" name="password"/>-->

						<input class="m-wrap placeholder-no-fix" type="password" placeholder="Password" name="password"/>

					</div>

				</div>

			</div>

			<div class="form-actions">

				<label class="checkbox">

				<input type="checkbox" name="remember" value="1"/> Remember me

				</label>

				<button type="submit" class="btn green pull-right">

				Login <i class="m-icon-swapright m-icon-white"></i>

				</button>            

			</div>



		</s:form>

		<!-- END LOGIN FORM -->        


	</div>

	<!-- END LOGIN -->

	<!-- BEGIN COPYRIGHT -->

	<div class="copyright">

		2017 &copy; Renault .

	</div>

	<!-- END COPYRIGHT -->

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->

	<script src="${pageContext.request.contextPath}/js/jquery-1.10.1.min.js" type="text/javascript"></script>

	<script src="${pageContext.request.contextPath}/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

	<script src="${pageContext.request.contextPath}/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      

	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>

	<!--[if lt IE 9]>

	<script src="${pageContext.request.contextPath}/js/excanvas.min.js"></script>

	<script src="${pageContext.request.contextPath}/js/respond.min.js"></script>  

	<![endif]-->   

	<script src="${pageContext.request.contextPath}/js/jquery.slimscroll.min.js" type="text/javascript"></script>

	<script src="${pageContext.request.contextPath}/js/jquery.blockui.min.js" type="text/javascript"></script>  

	<script src="${pageContext.request.contextPath}/js/jquery.cookie.min.js" type="text/javascript"></script>

	<script src="${pageContext.request.contextPath}/js/jquery.uniform.min.js" type="text/javascript" ></script>

	<!-- END CORE PLUGINS -->

	<!-- BEGIN PAGE LEVEL PLUGINS -->

	<script src="${pageContext.request.contextPath}/js/jquery.validate.min.js" type="text/javascript"></script>

	<!-- END PAGE LEVEL PLUGINS -->

	<!-- BEGIN PAGE LEVEL SCRIPTS -->

	<script src="${pageContext.request.contextPath}/js/app.js" type="text/javascript"></script>

	<script src="${pageContext.request.contextPath}/js/login.js" type="text/javascript"></script>      

	<!-- END PAGE LEVEL SCRIPTS --> 

	<script>

		jQuery(document).ready(function() {     

		  App.init();

		  Login.init();

		});

	</script>

	<!-- END JAVASCRIPTS -->

<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>

<!-- END BODY -->

</html>