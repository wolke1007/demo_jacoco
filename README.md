
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

3. 停止服務 `Ctrl + C` or `cmd + C`
4. 產生報告
```
gradlew build jacocoTestReport
```
5. 查看報告
`${project_root_directory}\build\reports\jacoco\test\html\index.html`