# ProductApplication
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/reference/htmlsingle/#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.10-SNAPSHOT/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

How To Start Project:

* Import Maven project from Spring Boot STS IDE. 
* Create db in MySql Workbench and add credentials in application.properties file.
* Update Maven Project as,  Right Click on Project -> Maven -> Update Project
* Run Project as, Right Click on Project -> Run As -> Spring Boot App
* Then tomcat will be start on specified port number and your project will be run successfully.
* To verify API's Use POSTMAN tool.

POST MAPPING:
* CREATE PRODUCTS API: --> http://localhost:8088/api/addproducts
1.	{     
    "productName":"Lenovo Yoga ",
    "productType":"Laptop",
    "productCategory":"Electronics ",
    "productPrice":"45000",
    "discount":"15",
   "charges":{
            "delivery":"350",
            "gst":"18"
        }
    }

2.	{     
        "productName": "LG Washing Machine   ",
        "productType": "Washing Machine ",
        "productCategory": "Home Appliances ",
        "productPrice": "25000",
        "discount":"22",
        "charges":{
            "delivery":"800",
            "gst":"24"
        }
    }

3.	{     
        "productName": "HP Pavilion 360",
        "productType": "Laptop",
        "productCategory": "Electronics",
        "productPrice":"60000",
	"discount":"15",
    "charges":{
            "delivery":"350",
            "gst":"18"
        }
    }

4.	{     
        "productName": "US Polo Assn",
        "productType": "T-Shirt",
        "productCategory": "Clothing",
        "productPrice":"1200",
        "discount":"40",
    "charges":{
            "delivery":"0",
            "gst":"12"
        }
    }

5.	{     
        "productName": "Neelkamal Been Bag",
        "productType": "Sofa Set",
        "productCategory": "Furniture",
        "productPrice":"350",
        "discount":"10",
    "charges":{
            "delivery":"300",
            "gst":"18"
        }
    }
    
GET MAPPING:
* READ PRODUCT API: --> http://localhost:8088/api/products

PUT MAPPING:
* UPDATE PRODUCT API: --> http://localhost:8088/api/updateproducts/1001 (product_id)

DELETE MAPPING:
* DELETE PRODUCT API: --> http://localhost:8081/api/deleteproducts/1001 (product_id)

GET MAPPING FOR getProducts():
* --> http://localhost:8088/api/products1/1001 (product_id)
