# Metrics  
Simple project to explore observability tools. This project sets up simple REST application, Prometheus and Grafana.

## How to run

Required docker and docker-compose installed. Execute command:  

```sh
docker-compose -f src/main/docker/stack.yml run
```  

Serivces are available:
* localhost:8080 - simple REST application
  * localhost:8080/counter/adder
  * localhost:8080/counter/atomic
* localhost:3000 - Grafana protected with user admin and password admin
* localhost:9090 - Prometheus

### Post-run steps

Grafana needs to be connected to Prometheus datasource in settings.  
> http://prometheus:9090  

Have fun and play with it! :)
