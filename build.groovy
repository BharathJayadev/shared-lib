
def compile(){
  sh "mvn compile"
}
def test(){
  sh "mvn test"
}
def qa(){
  sh "mvn checkstyle:checkstyle"
}
def build(){
  sh "sudo mv -f /var/lib/jenkins/workspace/project_address_book/target/addressbook.war /home/ubuntu/apache-tomcat-8.5.100/webapps"
}
