import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

static void main(String[] args) {

    def restClient=new RESTClient("http://localhost:3000/")

    //===============
    // POST
    //================

   //def product=["id":87,"name":"Note Book","price":43,"description":"White Pages","inStock":true]
/*
   def postResp= restClient.post(path: 'products',body:product,requestContentType: ContentType.JSON)

    if(postResp.status==201){
        println('post request was successfull')
        println(postResp.data)
    }else{
        println('POST request was failed ${postResp.status} ')
    }




    //===============
    // GET
    //================
    def products= restClient.get(path:'products');
    products.data.each{prod->{
        println(prod)
    }}
    //===============
    // GET by ID
    //================

    println("=================")
    def response= restClient.get(path:'products/15');
        if(response.status==200){
            println(response.data)
        }else{
            println("ID not found ${response.status}")
        }



     // PUT

    def product=["name":"Pen Drive","price":2500,"description":"512 GB","inStock":false]

    def putReq= restClient.put(path:'products/200',body:product,requestContentType: ContentType.JSON)

    println(putReq.status)
    println(putReq.data)

    // DELETE
    def delReq= restClient.delete(path:'/products/15')
    if(delReq.status==200){
        println("deleted ")
    }else{
        println("Not Deleted. Some issue : ${delReq.status}")
    }



 */


}