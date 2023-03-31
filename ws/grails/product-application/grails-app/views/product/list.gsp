<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>

<div class="create-product">
    <g:link action="create" class="btn btn-primary">Add New Product</g:link>
</div>

<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>
                <g:link action="edit" id="${product.id}" class="btn btn-sm btn-warning">Edit</g:link>
                <g:link action="delete" id="${product.id}" class="btn btn-sm btn-danger" onclick="return confirm('Are you sure you want to delete this product?');">Delete</g:link>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>
