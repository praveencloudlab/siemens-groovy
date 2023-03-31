<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>

<g:form action="update" id="${productInstance.id}">
    <div class="form-group">
        <label for="name">Name:</label>
        <g:textField name="name" id="name" value="${productInstance.name}" class="form-control"/>
    </div>

    <div class="form-group">
        <label for="price">Price:</label>
        <g:textField name="price" id="price" value="${productInstance.price}" class="form-control"/>
    </div>

    <div class="form-group">
        <label for="description">Description:</label>
        <g:textArea name="description" id="description" value="${productInstance.description}" class="form-control" rows="5"/>
    </div>

    <div class="form-group">
        <g:submitButton name="update" value="Update" class="btn btn-primary"/>
    </div>
</g:form>
</body>
</html>
