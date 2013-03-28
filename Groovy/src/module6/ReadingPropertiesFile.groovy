package module6

// Responsible for reading .properties files
Properties prop = new Properties()
def path ="C:\\Users\\Administrator\\IdeaProjects\\Selenium\\Groovy\\src\\module6\\application.properties"
FileInputStream fs = new FileInputStream(path)
prop.load(fs)


println(prop.getProperty("adminUserName"))
println(prop.getProperty("name"))