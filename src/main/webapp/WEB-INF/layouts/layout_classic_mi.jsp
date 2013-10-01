<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
	<!-- Middle East template -->
	<title><tiles:getAsString name="title" /></title>
	<link rel="stylesheet" type="text/css" href="style/HomeStyle.css">
</head>
<body>
	<div align="right">
		<table>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="header" /></td>
			</tr>
			<tr>
				<td><tiles:insertAttribute name="body" /></td>
				<td><tiles:insertAttribute name="menu" /></td>
			</tr>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="footer" /></td>
			</tr>
		</table>
	</div>
</body>
</html>