import groovy.ant.AntBuilder
import groovy.xml.MarkupBuilder
import groovy.xml.StreamingMarkupBuilder
import groovy.xml.XmlParser
import groovy.xml.XmlSlurper
import groovy.xml.XmlUtil
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.NodeList

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

static void deleteFile(){
  def file=new File('../newdir')
  file.delete();
}

static void writeFile(){
  def file=new File('../resources/demo.txt')
  file <<" \n This is new content2 of a file \t After tab"
  def contents=file.text;
  println(contents);
}

static void deleteDirectory(){
  def fileDir=new File('../abc')
  fileDir.isDirectory()?fileDir.deleteDir():println("Not a directory")
}

static void copyFiles(){
  def source=new File('../resources/demo.txt')
  def target=new File('../resources/example.txt')
 // source.co

}

static void createZip(){
  def zip=new ZipOutputStream(new FileOutputStream("../target/example.zip"))
  def file=new File('../resources/demo.txt')
  zip.putNextEntry(new ZipEntry(file.name))
  file.eachByte(1024){buffer,length->zip.write(buffer,0,length)}
  zip.closeEntry()
  zip.close()
}

static void antDemo(){
  def ant=new AntBuilder();
   //ant.setProperty('name','Hello World')
   //ant.toString();

}
static void createTarFile(){
  //def tar=new TarOutputStream()
}

static void readXml(){
  DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
  DocumentBuilder builder= factory.newDocumentBuilder();
  Document document= builder.parse(new File('../resources/test.xml'))
  Element root= document.getDocumentElement();
  //println(element)
  NodeList bookNodes= root.getElementsByTagName("book")
  //println(bookNodes)
  // Element book=bookNodes.item(1)
  //println(book)

  for(int i=0;i<bookNodes.getLength();i++){
    Element book=bookNodes.item(i)
    def id=book.getElementsByTagName("id").item(0).getTextContent()
    String title=book.getElementsByTagName("title").item(0).getTextContent()
    String author=book.getElementsByTagName("author").item(0).getTextContent()

    println(id)
    println(title)
    println(author)
    println("--------------------")

  }
}


static void xmlParserDemo(){

  def xml='''
    <books>
        <book>
          <title>Groovy</title>
          <author>John</author>
        </book>
        
          <book>
          <title>Spring</title>
          <author>James</author>
        </book>
    </books>

    '''
    def root=new XmlParser().parseText(xml);
    root.book.each{book->
      println(book.title.text())
      println(book.author.text())
    }
  //println(xml)
}

static void xmlSluperDemo(){
  def xml='''
    <books>
        <book>
          <title>Groovy</title>
          <author>John</author>
        </book>
        
          <book>
          <title>Spring</title>
          <author>James</author>
        </book>
    </books>
    '''
   def root=new XmlSlurper().parseText(xml);
   root.book.each{book->
    println(book.title.text())
    println(book.author.text())
  }
}

static void markupBuilderDemo(){
  def writer=new StringWriter();
  def xml=new MarkupBuilder(writer);
  xml.books{
    book(title:"Spring Boot",author:'Ruth')
    book(title: "ORM",author: "Bucky Wall")
  }

  println(writer.toString())
}

static void copyXmlToFileDemo(){
  def xml='''
    <books>
        <book>
          <title>Groovy</title>
          <author>John</author>
        </book>
        
          <book>
          <title>Spring</title>
          <author>James</author>
        </book>
    </books>
    '''
  def root=new XmlSlurper().parseText(xml);
   new File("../resources/mybooks.xml").withWriter {
     writer-> XmlUtil.serialize(root,writer)
   }

}

static void streamingXMLBuilderDemo(){
  def writer=new StringWriter();
  def xml=new StreamingMarkupBuilder();
  xml.bind(writer){
    books{
      book(title:"Spring Boot",author:'Ruth')
      book(title: "ORM",author: "Bucky Wall")
    }
  }
  println(writer.toString())
}

static void main(String[] args) {
  //def file=new File("../resources/demo.txt");
  //def contents=file.text;
  //println contents

  //def d1=new Directory();
  //def lf=new ListFiles();
  //d1.createDiretory()
  //lf.listFiles();

  //deleteFile()

  //writeFile()
  //deleteDirectory()
  //copyFiles()
  //createZip()
  //antDemo()
  //readXml()
   //xmlParserDemo()
  //xmlSluperDemo()
  //markupBuilderDemo()
  //streamingXMLBuilderDemo()
  copyXmlToFileDemo()
}