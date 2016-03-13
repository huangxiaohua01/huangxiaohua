<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
	<title>Insert title here</title>
 	<script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script> 
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/style-metro.css" rel="stylesheet" type="text/css"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link href="css/style-responsive.css" rel="stylesheet" type="text/css"/>
     <link href="css/uniform.default.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/DT_bootstrap.css" />
    <link rel="shortcut icon" href="image/favicon.ico" />
</head>
<body>
	<form action="/spring-mybatis/login.do" method="post">
		<table>
			<tr>
		       <td>用户：</td>
		       <td>  <input type="text" name="name"/></td>
		   </tr>
		     <tr>   
		     	<td>密码：</td>
		     	<td><input type="password" name="password"/> </td>
		</table>
		<input type="submit"  value="增加用户"/>
 	</form>
	
	<script type="text/javascript">
		var url="/tomcat-nginx/user";
		function show(){
			$.ajax({
				type:"post",
				url:url+"/login",
				dataType:"json",
				success:function(data){
					alert(1);	
				}
			});
		}
	</script>
</body>
</html>