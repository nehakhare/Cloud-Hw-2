# Cloud-Hw-2

WEATHER RESTful API 
This API works on previous weather data
This API was developed using JAVA and Spring boot Framework.
The build tool used is Maven.
All the operations are done using file readers.
The following are the endpoints for the api
(i) /historical/ - Get Meathod - list of all dates for which weather information is available. JSON array of each date in YYYYMMDD.
(ii) /historical/ - Get Meathod - Weather information for a particular date. if no information is available - 404 error.
(iii) /historical/ - Post Meathod - post infromation for desigred date.
(iv) /historical/ - Delete Meathod - Deleat information of desired date.
(v) /forecast/ - Get Meathod - Forecast Weather data from givin date.
Versions
JAVA: 8.

Spring boot 2.0.5.

Maven 3.0.5.
