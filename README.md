# joinfaces-conditional-faces-config
Demo project to showcase an issue of loading different faces-config.xml files depending on active Spring profile

Run the application with
`mvn spring-boot:run` and faces-config-lv.xml file will be loaded and http://localhost:8080/index.xhtml will show supported locales from faces-config-lv.xml file.

Run the application with
`java -jar target/demo-0.0.1-SNAPSHOT.jar` and the application won't be able to find faces-config-lv.xml file and log warning 
`JSF1067: Resource faces-config-lt.xml specified by the javax.faces.CONFIG_FILES configuration option cannot be found.  The resource will be ignored.`
