

## Automated tests code challenge




<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#usage">Notes</a></li>
    <li><a href="#contact">Contact</a></li>
    
  </ol>
</details>




## About The Project



 `github_username` : "githubprep"
 `repo_link` :https://github.com/githubprep/PetsoreApiTask
 `project_description` : The test automation is created by using **Cucumber** **BDD** framework with **RestAssured Library** for  API testing

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

* Java 1.8
* Rest Assured
* Maven 
* Cucumber Junit 
* Gherkin BDD


<p align="right">(<a href="#top">back to top</a>)</p>




## Getting Started

It is a test automation framework for "Take Home Task: QA Engineer". You may clone project from given above gitHUB account.
Than you can run the framework in your local.  
Cucumber BDD Gherkin language is used. The base Url is in the configuration properties file under project. With configuration reader 
class we reach to the configuration properties. Pojo class is used for Json-Java convert.







### Prerequisites
It is Java-Rest project. To run it needs Java 1.8 jdk.
You may run that test framework on your local in your IDE (IntelliJ recommended). Also it can start from command line.
In order to run from commandline you need to have Maven in your local.
  
<p align="right">(<a href="#top">back to top</a>)</p>




## Usage

CukesRunner class in Runners folder is responsible for test-run.

1.Go to the CukesRunner Class ( "src/test/java/com/api/runner/CukesRunner.java" )

2.Be sure that DryRun = False

3.To run specific Scenarios put the relevant annotation.




<p align="right">(<a href="#top">back to top</a>)</p> 




## Notes

The Petstore swagger document is updating  slowly sometimes. Even with manual testing with both swagger document and 
Postman I can not able to verify last changes with GET request. In test framework I don't want to add wait times since
it slows down the tests and the problem is from document. Sometimes (in general) GET tests failing. Than you may run again. 





## Contact

Ahmet Akyürek -- akyurekahmet@gmail.com

Project Link: https://github.com/githubprep/PetsoreApiTask

<p align="right">(<a href="#top">back to top</a>)</p>






