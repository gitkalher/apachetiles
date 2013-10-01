<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>

<div style="border: 1px solid #acacac; padding: 5px 30px;">
	<p>All assigned taggs to this topic are following:</p>

	<tiles:insertTemplate template="../layouts/layout_taggs.jsp">
		<tiles:putAttribute name="tag01" value="Java" type="string" />
		<tiles:putAttribute name="tag02" value="Spring" type="string" />
		<tiles:putAttribute name="tag03" value="Hibernate" type="string" />
	</tiles:insertTemplate>

	<p>Update taggs if you think any is missing.</p>
</div>