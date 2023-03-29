@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovyx.net.http.HTTPBuilder
//import groovyx.net.http.RESTClient

static void main(String[] args) {
//define empty class with old name to prevent failure
    this.getClass().getClassLoader().getParent().parseClass '''
  package groovy.util.slurpersupport
  class GPathResult{}
'''
    def restClient=new HTTPBuilder('http://localhost:3000/products')
    //println(restClient)


}