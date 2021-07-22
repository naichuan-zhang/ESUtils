### 环境要求

- JDK 1.8+
- ElasticSearch 7.13.3（下载：https://www.elastic.co/fr/downloads/elasticsearch ）
- logstash 7.13.3（下载：https://www.elastic.co/fr/downloads/logstash ）


### 运行

1. 运行ElasticSearch
2. `/resources/salary_payroll.conf` 文件拷贝到logstash安装路径下的`data`文件夹。
执行：

```text
D:\logstash-7.13.3> .\bin\logstash.bat -f .\data\salary_payroll.conf
```

执行后数据库中的salary_payroll表会与ES相关联，数据会被添加到表中，如果salary_payroll中有新添加的数据时，ES端也会同步

注：`salary_payroll.conf`文件中的配置需要根据本地环境来稍作修改...


