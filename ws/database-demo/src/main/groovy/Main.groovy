import groovy.sql.Sql
static void main(String[] args) {
  def sql=null;
  try{
    sql=Sql.newInstance("jdbc:mysql://localhost:3306/mydb","root","root1234","com.mysql.cj.jdbc.Driver")
//create table product(id int primary key,name varchar(50),price float,description varchar(50));
    //sql.execute("insert into product values(11,'Book',5600,'Java OOPS')")
    def products=sql.rows("select * from product")
    println(products)
  }catch (Exception e){
    e.printStackTrace()
  }finally {
    sql.close()

  }












}