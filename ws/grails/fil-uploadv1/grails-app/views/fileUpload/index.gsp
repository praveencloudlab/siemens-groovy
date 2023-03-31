<!DOCTYPE html>
<html>
<head>

    <title>File Upload</title>
</head>
<body>
<div>
    <h2>File Upload</h2>
    <g:if test="${flash.message}">
        <div class="message" role="alert">
            ${flash.message}
        </div>
    </g:if>
    <g:uploadForm action="upload" enctype="multipart/form-data">
        <label for="file">Select a file to upload:</label>
        <input type="file" name="file" id="file" required/>
        <input type="submit" value="Upload"/>
    </g:uploadForm>
</div>
</body>
</html>
