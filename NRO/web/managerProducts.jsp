
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Manager Products</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
            .page {
                margin: 23px 160px;
            }
            .page a{
                margin: 19px;
                padding: 10px 13px;
                border: 1px solid;
                border-radius: 29px;
            }
            a.active{
                background-color: greenyellow;
                font-weight: bold;
            }
            .btn-primary {
                color: #fff;
                background-color: cadetblue;
                border-color: gray;
                margin: -8px 0px 20px 0px;
                border-radius: 22px;
            }
            </style>
        <body>
            <div class="container">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Manager <b>Products</b></h2>
                            </div>
                            <div class="col-sm-6">
                                <a class="btn btn-success" href="add.jsp" target="_blank"><i class="material-icons">&#xE147;</i><span>Add New Product</span></a>                         						
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Planet</th>
                                <th>Image</th>
                                <th>Price</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${pageP}" var="o">
                                <tr>
                                    <td>${o.nickID}</td>
                                    <td>${o.planet}</td>
                                    <td>
                                        <img src="${o.image}">
                                    </td>
                                    <td>${o.money} VND</td>
                                    <td>                                 
                                        <a href="loadproduct?nickID=${o.nickID}"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a href="delete?pid=${o.nickID}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <nav class="d-flex justify-content-center wow fadeIn">
                        <ul class="page">
                            <c:forEach begin="1" end="${endP}" var="i">
                                <a class="${tagg==i?"active":""}" href="pagemanagerproduct?index=${i}">${i}</a>
                            </c:forEach>
                        </ul>
                    </nav>
                </div>
                <a href="home"><button type="button" class="btn btn-primary">Back to home</button></a>

            </div>
            <!-- Delete Modal HTML -->
            <div id="deleteEmployeeModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form>
                            <div class="modal-header">						
                                <h4 class="modal-title">Delete Product</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            </div>
                            <div class="modal-body">					
                                <p>Are you sure you want to delete these Records?</p>
                                <p class="text-warning"><small>This action cannot be undone.</small></p>
                            </div>
                            <div class="modal-footer">
                                <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                <input type="submit" class="btn btn-danger" value="Delete">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </a>
        <script src="js/manager.js" type="text/javascript"></script>
    </body>
</html>