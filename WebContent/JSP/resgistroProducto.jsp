<%-- 
    Document   : resgistroProducto
    Created on : 19-oct-2020, 10:12:32
    Author     : User
--%>

<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String ruta = "C:\\Users\\User\\Desktop\\ProyectoWeb\\imagenes";
            
            DiskFileItemFactory factory = new DiskFileItemFactory();
            
            factory.setSizeThreshold(1024);
            
            factory.setRepository(new File(ruta));
            
            ServletFileUpload upload = new ServletFileUpload(factory);
            
            try{
                List<FileItem> partes = upload.parseRequest(request);
                for(FileItem items: partes){
                    File file = new File(ruta,items.getName());
                    items.write(file);
                }
                out.println("Subido");
            }catch(Exception e){
                out.println("error");
            }
        %>
    </body>
</html>
