
# fuse-rhdg-quickstart
The purpose of this project is demonstrate the integration between Jboss Fuse 7 Spring Boot and Red Hat Datagrid.  

## Requirements
Before of run this project, ensure that a instance of RHDG is running with a cache configured.

## Implementations
### 1 - PUT a key 

To insert a key (put) in RHDG use the API [http://localhost:8083/cache/newKey](http://localhost:8083//cache/newKey)
This api should send a JSON below

    {
    	"key": "10",
    	"value": "Value to Key"
    }

The expected result is a ***HTTP status 200*** and a new key inserted in **RHDG**.

### 2 - GET a Key

To get a Key use the API [http://localhost:8083/cache/retrieveKey/{key}](http://localhost:8083/cache/retrieveKey/{key})

### 3 - Verify  number of actives nodes

The **route health-check-route**  execute a request in the Management REST API of RHDG to get the number of actives nodes.
The url is below:

    http://<RHDG HOST><Management PORT>/management/subsystem/datagrid-infinispan/cache-container/<CACHE CONTAINER NAME>>/health/HEALTH?operation=resource&include-runtime=true&json.pretty=1
	
This API requires basic authentication. Use the username and password configured during RHDG instalation.

# References

[Health Check API ](https://access.redhat.com/documentation/en-us/red_hat_data_grid/7.2/html/administration_and_configuration_guide/the_health_check_api)

[List of editable properties of Hot Rod API](https://docs.jboss.org/infinispan/9.4/apidocs/org/infinispan/client/hotrod/configuration/package-summary.html)

