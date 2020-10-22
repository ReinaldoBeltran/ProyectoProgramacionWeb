<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>User Management Application</title>
            <link rel="stylesheet" type="text/css" href="">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
		
		
        <body bgcolor="red">

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="https://www.javaguides.net" class="navbar-brand"> User Management App </a>
                    </div>

                    <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Productos</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${producto != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${producto == null}">
                            <form action="guardarProducto" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${producto != null}">
                                    Edit Producto
                                </c:if>
                                <c:if test="${user == null}">
                                    Agregar Nuevo Producto
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${producto != null}">
                            <input type="hidden" name="id" value="<c:out value='${producto.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>ID</label> <input type="text" value="<c:out value='${producto.id}' />" class="form-control" name="id" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Referencia</label> <input type="text" value="<c:out value='${producto.referencia}' />" class="form-control" name="referencia">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Nombre:</label> <input type="text" value="<c:out value='${producto.nombre}' />" class="form-control" name="nombre">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Descripcion:</label> <input type="text" value="<c:out value='${producto.descripcionCorta}' />" class="form-control" name="descripcionCorta">
                        </fieldset>
						<fieldset class="form-group">
                            <label>Detalle</label> <input type="text" value="<c:out value='${producto.detalle}' />" class="form-control" name="detalle">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Valor</label> <input type="text" value="<c:out value='${producto.valor}' />" class="form-control" name="valor">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>ID de Categoria</label> <input type="text" value="<c:out value='${producto.categoria_id}' />" class="form-control" name="categoria_id">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>ID de Marca</label> <input type="text" value="<c:out value='${producto.marca_id}' />" class="form-control" name="marca_id">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Imagen</label> <input type="text" value="<c:out value='${producto.imagen}' />" class="form-control" name="imagen">
                        </fieldset>
                        <button type="submit" class="btn btn-success">Guardar</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>