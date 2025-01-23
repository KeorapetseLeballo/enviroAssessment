# ENVIROAssessment
## This project is a REST API for a wastemanagement/environmental app
### It is a springboot project

## !!! Instructions !!!
 - Clone the repo <br>
 - **Run** KeorapetseleballoApplication.java <br>
 - For PATCH and POST, the static html files can be used to upload or update the specific fields <br>
 - So to upload a category, http://localhost:8080/upload.html can be used etc.. **ONLY** changing the appended part after the port to required static file <br>
   
   
   
## Endpoints
***GET***<pre>  http://localhost:8080/                            - Small description of what the API is about <br></pre>
***POST***<pre> http://localhost:8080/categories                  - Create a category with relavent information <br></pre>
***GET***<pre>  http://localhost:8080/categories                  - Gets JSON representation of all the categories and information in the database <br></pre>
***GET***<pre>  http://localhost:8080/categories/{id}             - Gets JSON representation of a specific categories infomation, searched for by id <br></pre>
***GET***<pre>  http://localhost:8080/categories/{id}/guidelines  - Gets the disposal guidelines of a specific category <br></pre>
***GET***<pre>  http://localhost:8080/categories/{id}/retrieval   - Gets the retrieval guidelines of a specific category <br></pre>
***DELETE***<pre> http://localhost:8080/categories/delete/{id}    - Deletes category based of id <br></pre>
***PATCH***<pre> http://localhost:8080/update/disposal/{id}       - Updates/changes the disposal guidelines in the database <br></pre>
***PATCH***<pre> http://localhost:8080/update/retrieval/{id}      - Updates/changes the retrieval guidelines in the database <br></pre>

## H2 Database <br>
**Database Endpoint:** http://localhost:8080/h2-console <br>
**Username:** sa <br>
**--No password Required--** <br>
