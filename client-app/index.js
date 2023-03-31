fetch('http://localhost:8080/product/')
.then(response=>response.json())
.then(products=>console.log(products))
