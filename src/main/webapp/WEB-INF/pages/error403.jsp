<%-- 
    Document   : error403
    Created on : Sep 15, 2015, 4:43:06 PM
    Author     : Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>403 | Access denied</title>
        <%@ include file="../jspf/css.jspf"%>

    </head>
    <body>

        <!-- content -->
        <div class="container-fluid body-align-center">
            <div class="row-fluid">
                <div class="col-lg-12">
                    <div class="centering text-center error-container">
                        <div class="text-center">
                            <h2 class="without-margin">
                                Don't worry. It's <span class="text-warning"><big>403</big></span>
                                error only.
                            </h2>
                            <h4 class="text-warning">Access denied</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="../jspf/footer.jspf"%>
    </body>
</html>
