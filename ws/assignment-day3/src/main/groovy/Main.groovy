import groovyx.net.http.RESTClient

static void main(String[] args) {

  def baseURL = 'http://localhost:3000/'
  def restClient = new RESTClient(baseURL)

  def revData=restClient.get(path:'reservations/R1')
  println(revData.data)
  def flightId=revData.data.flightId
  def flightInfo=restClient.get(path:"flights/${flightId}")
  println(flightInfo.data)








}