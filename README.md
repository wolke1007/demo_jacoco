# Spring Boot + Gradle 導入 Jacoco 觀察測試覆蓋率

## 環境
- JDK 11
- Gradle 6.7.1

## 操作步驟 
1. 啟動服務
    ```
    java -javaagent:jacocoagent_0.8.12.jar=destfile=test_jacoco.exec,append=true -jar demo_jacoco-1.0.0.jar
    ```
2. 進行測試
    ```bash
    curl http://localhost:8080/hello  
    curl http://localhost:8080/param_test?param=1  
    curl http://localhost:8080/param_test?param=11
    ```

3. 停止服務  
    `Ctrl + C` or `cmd + C`
4. 使用 gradle 操作 jacoco 產生報告  
    ```
    gradlew build jacocoTestReport
    ```
5. 查看測試覆蓋率報告  
預設位置會在這邊 `${your_project_root_directory}\build\reports\jacoco\test\html\index.html`

---------------------------

## 資料來源

Jacoco Agent Download  
https://www.eclemma.org/jacoco/

Jacoco Agent Document  
https://www.eclemma.org/jacoco/trunk/doc/agent.html

