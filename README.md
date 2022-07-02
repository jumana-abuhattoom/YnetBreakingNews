# Welcome to Jenkins Closing Task

 * This repository Reads the “Breaking News” from YNet new service: http://www.ynet.co.il/Integration/StoryRss2.xml 
*   When connecting to your Web App, the App parses and Presents the Breaking News XML in an HTML Table Format 


# Run Locally

```
git clone https://github.com/jumana-abuhattoom/YnetBreakingNews.git
cd YnetBreakingNews
mvn package  
java -jar ./target/xmltohtml-0.0.1-SNAPSHOT.jar
```

![ynet1](https://user-images.githubusercontent.com/57894655/176967911-c2ea4557-f9d9-4b87-b979-c54c3fec6b23.PNG)

## Jenkins pipeline Job
Build succeed 
![ynet2](https://user-images.githubusercontent.com/57894655/176967907-770960bd-487d-4493-92df-395674d492bb.PNG)

## Jenkins pipeline sends a notification to slack

![ynet3](https://user-images.githubusercontent.com/57894655/176967909-697fa256-4162-442e-a050-89286deddf2e.PNG)
