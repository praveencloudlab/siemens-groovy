<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>

    <title>Create Product</title>
</head>
<body>
<h1>Create Product</h1>

<g:form action="save">
    <div class="form-group">
        <label for="name">Name:</label>
        <g:textField name="name" id="name" value="${productInstance.name}" class="form-control"/>
    </div>

    <div class="form-group">
        <label for="price">Price:</label>
        <g:textField name="price" id="price" class="form-control"/>
    </div>

    <div class="form-group">
        <label for="description">Description:</label>
        <g:textArea name="description" id="description" class="form-control" rows="5"/>
    </div>

    <div class="form-group">
        <g:submitButton name="create" value="Create" class="btn btn-primary"/>
    </div>
</g:form>
</body>
</html>
