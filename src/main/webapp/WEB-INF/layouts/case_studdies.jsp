<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<tilesx:useAttribute id="list" name="casestuddies" classname="java.util.List" />

<table cellspacing="30">
	<tr>
		<c:forEach var="item" items="${list}">
			<td><tiles:insertAttribute value="${item}" flush="true" /></td>
		</c:forEach>
	</tr>
</table>