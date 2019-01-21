<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@page import="java.util.*"%>
    <title>Servlet</title>
    <script type="text/javascript" >
        var xmlHttpRequest;
        function create(){
            xmlHttpRequest = new XMLHttpRequest();
        }

        window.onload= function(){
            document.getElementById("btn").addEventListener("click",function(){
                var msg = document.getElementById("msg").value;
                create();
                xmlHttpRequest.open("post","TestServlet.ajax?msg="+msg);
                xmlHttpRequest.send(null);
                xmlHttpRequest.onreadystatechange=function(){
                    if(xmlHttpRequest.readyState == 2 || xmlHttpRequest ==3){
                        console.info("sucess");
                    }
                    if(xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){

                        var pEl = document.createElement("p"); //创建元素
                        pEl.appendChild(document.createTextNode(xmlHttpRequest.responseText));

                        document.getElementById("showDiv").appendChild(pEl);
                    }
                }

            },false);
        }

    </script>
</head>
<body>
    <div id="showDiv" style="height: 100px;overflow:auto"></div>
<div>
    <input type="text" id="msg" name="msg">
    <input type="button" id="btn" name="btn" value="确定">
</div>
</body>
</html>
