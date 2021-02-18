<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controllers Spring</title>
</head>
<body>
	 <h1>Param - Index</h1>

	 <p>Parametro nome = "<%= request.getAttribute("servicos") %>"</p>
	 <p>Pagina chamada a partir do mapping em ParamController</p>
</body>
</html>