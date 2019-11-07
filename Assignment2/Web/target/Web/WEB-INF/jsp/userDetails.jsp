<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/userDetails.css"/>
    <title>MyBay</title>
</head>

<body>
<div class="userDetails-container">
    <div class="logo-container">
        <a href="${pageContext.request.contextPath}/home"><img class="mb-4" src="images/logo.png"></a>
    </div>
    <div class="userDetails-form-container">
        <div class="userDetails-text-container">
            <h1 align="center">User Details</h1>
        </div>
        <form class="form-userDetails" action="${pageContext.request.contextPath}/userDetails" method="post">
            <div class="userDetails-form-fields-container">
                <div class="userDetails-fields-container">
                    <input type="text" id="name" name="name" placeholder="Name" maxlength="150" value="${user.name}" required>
                </div>
                <div class="userDetails-fields-container">
                    <input type="email" id="email" name="email" placeholder="Email" maxlength="150" value="${user.email}" required>
                </div>

                <div class="userDetails-fields-container">
                    <input type="password" id="password" name="password" placeholder="Password" maxlength="15" required>
                </div>
                <div class="userDetails-fields-container">
                    <select id="country" name="country">
                        <option value="" selected disabled hidden>Choose here</option>
                        <option value="Alemanha">Alemanha</option>
                        <option value="Austria">Aústria</option>
                        <option value="Belgica">Bélgica</option>
                        <option value="Bulgaria">Bulgária</option>
                        <option value="Chipre">Chipre</option>
                        <option value="Croacia">Croácia</option>
                        <option value="Dinamarca">Dinamarca</option>
                        <option value="Eslovaquia">Eslováquia</option>
                        <option value="Eslovenia">Eslovénia</option>
                        <option value="Espanha">Espanha</option>
                        <option value="Estonia">Estónia</option>
                        <option value="Finlandia">Finlândia</option>
                        <option value="Franca">França</option>
                        <option value="Grecia">Grécia</option>
                        <option value="Hungria">Hungria</option>
                        <option value="Irlanda">Irlanda</option>
                        <option value="Islandia">Islândia</option>
                        <option value="Italia">Itália</option>
                        <option value="Luxemburgo">Luxemburgo</option>
                        <option value="Noruega">Noruega</option>
                        <option value="PaisesBaixos">Países Baixos</option>
                        <option value="Polonia">Polónia</option>
                        <option value="Portugal">Portugal</option>
                        <option value="ReinoUnido">Reino Unido</option>
                        <option value="RepublicaCheca">República Checa</option>
                        <option value="Romenia">Roménia</option>
                        <option value="Russia">Rússia</option>
                        <option value="Servia">Sérvia</option>
                        <option value="Suecia">Suécia</option>
                        <option value="Suica">Suéca</option>
                        <option value="Ucrania">Ucrânia</option>
                    </select>
                </div>
                <c:if test="${errorMsg}">
                    <div class="invalid-userDetails-message">
                        <h4 align="center">Email is already used</h4>
                    </div>
                </c:if>
                <div class="userDetails-button-container">
                    <div class="userDetails-delete-button-container">
                        <input type="submit" class="userDetails-delete-button" name="delete" value="Delete">
                    </div>
                    <div class="userDetails-cancel-button-container">
                        <input type="submit" class="userDetails-cancel-button" name="cancel" value="Cancel">
                    </div>
                    <div class="userDetails-save-button-container">
                        <input type="submit" class="userDetails-button" name="save" value="Save">
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
