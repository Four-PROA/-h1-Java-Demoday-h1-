<%@page import="com.cadastrocliente.dao.ClienteDao"%>
<jsp:useBean id="u" class="com.cadastrocliente.bean.Cliente"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=ClienteDao.save(u);
if(i>0){
response.sendRedirect("addcliente-sucesso.jsp");
}else{
response.sendRedirect("addcliente-erro.jsp");
}
%>